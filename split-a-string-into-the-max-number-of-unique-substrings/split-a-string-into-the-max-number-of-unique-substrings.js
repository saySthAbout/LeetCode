/**
 * @param {string} s
 * @return {number}
 */
var maxUniqueSplit = function(s, set) {
    let resultSet = dfs(s, new Set());
    return resultSet.size;
};

function dfs(s, set) {
    // console.log(set);
    if(s == '') return set;
    let result = new Set();
    for (let i = 1; i <= s.length; i++) {
        let left = s.substring(0, i);
        let right = s.substring(i);

        let nSet = new Set(set);

        if(nSet.has(left)) continue;
        nSet.add(left);

        let nnSet = dfs(right, nSet);
        if(result.size < nnSet.size){
            result = nnSet;
        }
    }
    return result;
}