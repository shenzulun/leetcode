package org.magen.oj.leetcode.hard.s1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <pre>
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.
get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 	</pre>
 * @author shenzl
 * @date 2014年11月12日
 */
public class LRUCacheSolution {
	
	public static final int DEFAULT_INITIAL_CAPACITY = 16;
	public static final float DEFAULT_LOAD_FACTOR = 0.75f;
	private LinkedHashMap<Integer, Integer> map;
	private int cacheSize;
	
	public LRUCacheSolution(int capacity) {
		this.cacheSize = capacity;
		int hashTableCapacity = (int)Math.ceil(cacheSize / DEFAULT_LOAD_FACTOR) + 1;
		map = new LinkedHashMap<Integer,Integer>(hashTableCapacity, DEFAULT_LOAD_FACTOR, true){
			private static final long serialVersionUID = 1L;
			@Override
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
				return size() > LRUCacheSolution.this.cacheSize;
			}
		};
    }
    
    public int get(int key) {
    	boolean isExist = map.containsKey(key);
    	return isExist ? map.get(key) : -1;
    }
    
    public void set(int key, int value) {
        map.put(key, value);
    }
}
