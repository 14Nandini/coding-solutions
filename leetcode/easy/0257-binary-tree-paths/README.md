# Binary Tree Paths

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the `root` of a binary tree.

Return all  **root-to-leaf**  paths in  **any order**.

A  **leaf**  is a node with no children.

 

 **Example 1:** 

```
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

```

 **Example 2:** 

```
Input: root = [1]
Output: ["1"]

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 100].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 35.40%)  
**Memory:** 49.7 MB (beats 39.15%)  
**Submitted:** 2026-09-04T14:31:12.665Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root != null) findPaths(root, "", res);
        return res;
    }

    private void findPaths(TreeNode node, String path, List<String> res) {
        path += (path.isEmpty() ? "" : "->") + node.val;
        
        if (node.left == null && node.right == null) {
            res.add(path);
            return;
        }
        
        if (node.left != null)  findPaths(node.left, path, res);
        if (node.right != null) findPaths(node.right, path, res);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-paths/)