let arr = [10, 56, 32, 56, 93, 94, 12, 34, 65]

function selectionSort(arr){
	for (let i = 0; i < arr.length; i++) {
		// Assume the first element of the array is the smallest
		let lesserIndex = i;
		for (let j = i+1; j < arr.length; j++) {
			if(arr[j] < arr[lesserIndex]){
				lesserIndex = j;
			}
			
			// console.log(lesserIndex);
		}
		// swap
		let lesser = arr[lesserIndex];

		arr[i+1] = arr[i];
		arr[i] = lesser;
	}
	console.log(arr)
}

selectionSort(arr);