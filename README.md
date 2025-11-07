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
```
# Collection Uses and Time Complexity
<table>
  <thead>
    <tr>
      <th>Purpose</th>
      <th>Recommended Collection</th>
      <th>Time Complexity (common operations)</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Fast access by index</td>
      <td>ArrayList</td>
      <td>get: O(1), add(end): O(1) amortized, insert/remove(middle): O(n)</td>
    </tr>
    <tr>
      <td>Frequent insertions / deletions</td>
      <td>LinkedList</td>
      <td>get(by index): O(n), add/remove at ends: O(1), insert/middle: O(n)</td>
    </tr>
    <tr>
      <td>Queue (FIFO)</td>
      <td>LinkedList / ArrayDeque</td>
      <td>offer/poll/peek: O(1), contains: O(n)</td>
    </tr>
    <tr>
      <td>Stack (LIFO)</td>
      <td>LinkedList / ArrayDeque</td>
      <td>push/pop/peek: O(1), contains: O(n)</td>
    </tr>
    <tr>
      <td>Unique elements, no order needed</td>
      <td>HashSet</td>
      <td>add/remove/contains: O(1) average, O(n) worst</td>
    </tr>
    <tr>
      <td>Unique elements, preserve insertion order</td>
      <td>LinkedHashSet</td>
      <td>add/remove/contains: O(1) average, O(n) worst</td>
    </tr>
    <tr>
      <td>Unique elements, automatically sorted</td>
      <td>TreeSet</td>
      <td>add/remove/contains: O(log n)</td>
    </tr>
    <tr>
      <td>Key–value pairs, no ordering required</td>
      <td>HashMap</td>
      <td>get/put/remove: O(1) average, O(n) worst</td>
    </tr>
    <tr>
      <td>Key–value pairs, preserve insertion order</td>
      <td>LinkedHashMap</td>
      <td>get/put/remove: O(1) average, O(n) worst</td>
    </tr>
    <tr>
      <td>Key–value pairs, automatically sorted by key</td>
      <td>TreeMap</td>
      <td>get/put/remove: O(log n)</td>
    </tr>
  </tbody>
</table>

