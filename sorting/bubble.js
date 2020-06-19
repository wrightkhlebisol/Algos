let arr = [10, 56, 32, 56, 93, 94, 12, 34, 65]

function bubbleSort(arr) {
	for (let i = 0; i < arr.length; i++) {
		for (j = i; j < arr.length; j++) {
			// swap
			if (arr[j] < arr[i]) {
				// assign the lesser value so its not overriden during swap
				let lesser = arr[j];
				arr[j] = arr[i];
				arr[i] = lesser;

			}
		}
	}
	return (arr);
}

console.log(bubbleSort(arr));