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
<table>
          <thead>
            <tr>
              <th>Purpose</th>
              <th>Recommended Collection</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td data-label="Purpose">Fast access by index</td>
              <td data-label="Recommended Collection"><span class="badge">ArrayList</span></td>
            </tr>
            <tr>
              <td data-label="Purpose">Frequent insertions / deletions</td>
              <td data-label="Recommended Collection"><span class="badge">LinkedList</span></td>
            </tr>
            <tr>
              <td data-label="Purpose">Queue (FIFO)</td>
              <td data-label="Recommended Collection"><span class="badge">Queue</span> (<em>LinkedList</em> or <em>ArrayDeque</em>)</td>
            </tr>
            <tr>
              <td data-label="Purpose">Stack (LIFO)</td>
              <td data-label="Recommended Collection"><span class="badge">Stack</span></td>
            </tr>
            <tr>
              <td data-label="Purpose">Unique elements, no order needed</td>
              <td data-label="Recommended Collection"><span class="badge">HashSet</span></td>
            </tr>
            <tr>
              <td data-label="Purpose">Unique elements, preserve insertion order</td>
              <td data-label="Recommended Collection"><span class="badge">LinkedHashSet</span></td>
            </tr>
            <tr>
              <td data-label="Purpose">Unique elements, automatically sorted</td>
              <td data-label="Recommended Collection"><span class="badge">TreeSet</span></td>
            </tr>
            <tr>
              <td data-label="Purpose">Key–value pairs, no ordering required</td>
              <td data-label="Recommended Collection"><span class="badge">HashMap</span></td>
            </tr>
            <tr>
              <td data-label="Purpose">Key–value pairs, preserve insertion order</td>
              <td data-label="Recommended Collection"><span class="badge">LinkedHashMap</span></td>
            </tr>
            <tr>
              <td data-label="Purpose">Key–value pairs, automatically sorted by key</td>
              <td data-label="Recommended Collection"><span class="badge">TreeMap</span></td>
            </tr>
          </tbody>
        </table>

