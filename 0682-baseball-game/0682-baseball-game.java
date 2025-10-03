class Solution {
    public int calPoints(String[] operations) {
        List<Integer> l1 = new ArrayList<>();

        for (String op : operations) {
            if (op.equals("C")) {
                l1.remove(l1.size() - 1);
            } 
            else if (op.equals("D")) {
                l1.add(l1.get(l1.size() - 1) * 2); 
            } 
            else if (op.equals("+")) {
                int size = l1.size();
                l1.add(l1.get(size - 1) + l1.get(size - 2));
            } 
            else {
                l1.add(Integer.parseInt(op)); 
            }
        }
        return l1.stream().mapToInt(Integer::intValue).sum();
    }
}
