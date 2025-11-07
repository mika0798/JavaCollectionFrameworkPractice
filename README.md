# ☕ Java Collection Framework Structure

```text
Collection (interface)
 ├── List (interface)
 │     ├── ArrayList
 │     ├── LinkedList
 │     └── Vector
 │           └── Stack
 │
 ├── Queue (interface)
 │     ├── LinkedList
 │     ├── PriorityQueue
 │     └── Deque (interface)
 │           ├── ArrayDeque
 │           └── LinkedList
 │
 └── Set (interface)
       ├── HashSet
       ├── LinkedHashSet
       └── SortedSet (interface)
              └── TreeSet
       
Map (interface)
 ├── HashMap
 ├── LinkedHashMap
 └── SortedMap (interface)
        └── TreeMap

