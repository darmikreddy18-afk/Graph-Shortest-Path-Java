# Graph‑Shortest‑Path‑Java
A Java implementation of graph algorithms (Dijkstra’s Algorithm and Bellman-Ford) to compute shortest paths in weighted graphs.

## Features
- Implements **Dijkstra’s Algorithm** for graphs with non-negative weights.  
- Implements **Bellman-Ford Algorithm** for graphs with negative weights.  
- Console-based output showing the shortest distances from the source vertex.  

## How to Run
- Clone the repository:  
  `git clone https://github.com/darmikreddy18-afk/Graph-Shortest-Path-Java.git`
- Compile and run the Dijkstra program:  
  `javac graph_shortest_path_project.java`  
  `java graph_shortest_path_project`
- Compile and run the Bellman-Ford program:  
  `javac graph_shortest_path_project_2.java`  
  `java graph_shortest_path_project_2`

## What I Learned
- Graph representation using adjacency lists in Java  
- Implementing Dijkstra’s Algorithm using a priority queue  
- Implementing Bellman-Ford Algorithm to handle negative weights  
- Writing clean, modular Java code and documenting steps

## Future Improvements
- Add a GUI visualisation using JavaFX
- Allow user input of custom graphs
- Extend to directed graphs or alternative pathfinding algorithms
- Detect negative weight cycles in Bellman-Ford
