#
# A Simple Binary Search algorithm using recursion
#
#

def BSearchRecur(arr: list, first: int, last: int, target: int):
	mid = int((first + last) / 2)

	if first > last:
		print("serching result : not thing!!!")
	elif arr[mid] == target:
		print("serching result : ", mid, "index")
	elif arr[mid] > target:
		BSearchRecur(arr, first, mid - 1, target)
	else:
		BSearchRecur(arr, mid + 1, last, target)	


def main():
	arr = [1,3,5,7,9]
	BSearchRecur(arr, 0, 4, 7)
	BSearchRecur(arr, 0, 4, 4)

if __name__ == "__main__":
	main()