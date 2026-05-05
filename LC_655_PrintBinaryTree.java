class Solution {
    public List<List<String>> printTree(TreeNode root) {
        int h = height(root);
        int rows = h;
        int cols = (int)Math.pow(2, h) - 1;

        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < rows; i++){
            List<String> row = new ArrayList<>();
            for(int j = 0; j < cols; j++){
                row.add("");
            }
            res.add(row);
        }

        fill(res, root, 0, (cols - 1) / 2, h);
        return res;
    }

    private void fill(List<List<String>> res, TreeNode node, int r, int c, int h){
        if(node == null) return;

        res.get(r).set(c, String.valueOf(node.val));

        int offset = (int)Math.pow(2, h - r - 2);
        fill(res, node.left, r + 1, c - offset, h);
        fill(res, node.right, r + 1, c + offset, h);
    }

    private int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
