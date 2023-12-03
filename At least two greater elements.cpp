// Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.
// Example 1:

// Input : 
// a[] = {2, 8, 7, 1, 5}
// Output :
// 1 2 5 
// Explanation :
// The output three elements have two or
// more greater elements.   


vector<int> findElements(int a[], int n)
    {
        sort(a, a+n);
        vector<int> ans;
        for(int i=0; i<=n-3; i++){
            ans.push_back(a[i]);
        }
        return ans;
    }
