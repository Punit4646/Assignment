// C++ program to calculate
// the average of a batsman
#include <bits/stdc++.h>
using namespace std;

// Function to find the average
// of a batsman
double averageRuns(int runs,
				int matches,
				int notout)
{
	// Calculate number of
	// dismissals
	int out = matches - notout;

	// check for 0 times out
	if (out == 0)
		return -1;

	// Calculate batting average
	double avg = double(runs) / out;

	return avg;
}

// Driver Program
int main()
{
	int runs = 10000;
	int matches = 250;
	int notout = 50;

	double avg
		= averageRuns(
			runs, matches, notout);

	if (avg == -1)
		cout << "NA";
	else
		cout << avg;

	return 0;
}
