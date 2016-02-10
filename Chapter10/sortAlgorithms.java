package sortAlgorithms;

public class sortAlgorithms
{
	public static void switchnumber(int[] arr, int a, int b)
	{
		int tem = arr[a];
		arr[a] = arr[b];
		arr[b] = tem;

	}

	public static void bubblesort(int[] unsorted)
	{
		bubbleSort(unsorted, 0);
	}

	public static void selectionsort(int[] unsorted)
	{
		selectionSort(unsorted, 0);
	}

	// bubble sort
	public static void bubbleSort(int[] unsorted, int finished)
	{
		if (finished == 1 || unsorted.length < 2)
		{
			return;
		}
		finished = 1;
		for (int i = 0; i < unsorted.length - 1; i++)
		{
			if (unsorted[i] > unsorted[i + 1])
			{
				switchnumber(unsorted, i, i + 1);
				finished = 0;
			}
		}
		bubbleSort(unsorted, finished);
	}

	// selection sort
	public static void selectionSort(int[] unsorted, int finished)
	{
		if (finished == unsorted.length)
		{
			return;
		}

		int tem = finished;
		for (int i = finished; i < unsorted.length; i++)
		{
			if (unsorted[i] < unsorted[tem])
			{
				tem = i;
			}
		}
		switchnumber(unsorted, tem, finished);
		finished++;
		selectionSort(unsorted, finished);
	}

	public static void mergesort(int[] arr)
	{
		int[] tem = new int[arr.length];
		mergesort(arr, tem, 0, arr.length - 1);
	}

	public static void mergesort(int[] arr, int[] tem, int start, int end)
	{
		if (start < end)
		{
			int mid = (start + end) / 2;
			mergesort(arr, tem, start, mid);
			mergesort(arr, tem, mid + 1, end);
			merge(arr, tem, start, mid, end);
		}
	}

	public static void merge(int[] arr, int[] tem, int start, int middle, int end)
	{
		for (int i = start; i <= end; i++)
		{
			tem[i] = arr[i];
		}

		int temleft = start;
		int temright = middle + 1;
		int current = start;

		while (temleft <= middle && temright <= end)
		{
			if (tem[temleft] <= tem[temright])
			{
				arr[current] = tem[temleft];
				temleft++;
			} else
			{
				arr[current] = tem[temright];
				temright++;
			}
			current++;
		}

		int remain = middle - temleft;
		for (int i = 0; i <= remain; i++)
		{
			arr[current + i] = tem[temleft + i];
		}
	}

	public static void quicksort(int arr[])
	{
		int left = 0;
		int right = arr.length;
		quicksort(arr, left, right-1);
	}

	public static void quicksort(int arr[], int left, int right)
	{
		int mid=sort(arr,left,right);
		if (left < mid-1)
		{
			quicksort(arr, left, mid - 1);
		}
		if (mid < right)
		{
			quicksort(arr, mid, right-1);
		}
	}

	public static int sort(int arr[], int left, int right)
	{
		int tem = arr[(right - left) / 2];

		while (left <= right)
		{
			// 找到所有小于tem的数值
			while (arr[left] < tem)
			{
				left++;
			}

			while (arr[right] >tem)
			{
				right--;
			}
			// swap elements
			if (left <= right)
			{
				switchnumber(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[] =
		// {0,1,2,3,4,5,6,7,8,9,10};
		{ 5, 4, 3, 2, 1, 0, 7, 9, 10 };
		// bubblesort(a);
		quicksort(a);
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
