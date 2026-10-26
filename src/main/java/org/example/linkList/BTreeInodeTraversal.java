package org.example.linkList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTreeInodeTraversal {

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> results = new ArrayList<>();
        if(root == null) return results;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            results.add(cur.val);
            cur = cur.right;
        }
        return results;
    }
}
