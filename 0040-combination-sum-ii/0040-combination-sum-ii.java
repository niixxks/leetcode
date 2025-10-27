class Solution {
    public void combo(int i, int[] candidates, List<Integer> temp, List<List<Integer>> res, int target, int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (i == candidates.length || sum > target) return;

        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) continue;
            temp.add(candidates[j]);
            combo(j + 1, candidates, temp, res, target, sum + candidates[j]);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        combo(0, candidates, new ArrayList<>(), res, target, 0);
        return res;
    }
}
