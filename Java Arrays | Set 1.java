// For a given array of price of items,you have to calculate the average of all prices upto 2 decimal places.
// Note: Sum is printed automatically, you only need to calculate and return the average

// Example 1:

// Input:
// 5
// 1 2 3 4 5
// Output:
// 15 3.00 
// Explanation:
// Sum of the array is 15, hence 
// average is 15/5=3.00. 

String average(int A[], int N)
    {
        double sum=0;
        for(int i=0;i<N;i++)
            sum+=A[i];
            
        return String.format("%.2f", sum/N);
    }
