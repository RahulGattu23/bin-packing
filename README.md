# bin-packing

The bin packing problem is formulated as follows:  given a set of N file sizes between 0 and 1,000,000 KB (1 GB), find a way to assign them to a minimal number of disks, each of capacity 1 GB. The worst-fit heuristic is a simple rule that considers the file sizes in the order they are presented:  if the sound file won't fit on any disk, create a new disk; otherwise place the file on a disk that has the most remaining space. For example, this algorithm would put the sizes 700,000, 800,000, 200,000, 150,000, 150,000 onto three disks: {700,000, 200,000}, {800,000, 150,000}, {150,000}. Note that this does not necessarily lead to the best solution since the five files could fit on two disks.

Perspective: The bin packing problem is a fundamental problem for minimizing the consumption of a scarce resource, usually space. Applications include: packing the data for Internet phone calls into ATM packets, optimizing file storage on removable media, assigning commercials to station breaks, allocating blocks of computer memory, and minimizing the number of identical processors needed to process a set of tasks by a given deadline. In the latter example, the scarce resource is time instead of space. Cloth, paper, and sheet metal manufacturers use a two-dimensional version of the problem to optimally cut pieces of material (according to customer demand) from standard sized rectangular sheets. Shipping companies use a three-dimensional version to optimally pack containers or trucks.

![image](https://github.com/user-attachments/assets/e68d37e1-cf6e-426a-ae33-4273ab9239ad)
![image](https://github.com/user-attachments/assets/04b5f30c-48c3-488b-916d-4745493174f4)

