
# <h1 align="center">List - ArrayList 

### - Method1 : Use putIfAbsent
```java
Map<String, List<Integer>> map = new HashMap();
map.putIfAbsent("mango",new ArrayList<>());
map.get("mango").add(5);
```

### - Method 2: Check key present in Map
```java
Map<String, List<Integer>> map = new HashMap();
if(! map.containsKey("mango"){
    map.put("mango",new ArrayList<>());
}
List<Integer> list = map.get("mango");
list.add(3);
```

### - Method 3: Use getOrDefault
```agsl
Map<String, List<Integer>> map = new HashMap();
List<Integer> list = map.getOrDefault("mango",new ArrayList<>());
list.add(4)
```