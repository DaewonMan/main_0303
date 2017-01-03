#
#   순차탐색 연산획수와 비교
#    
#    n = 500
#    n = 5000
#    n = 50000
#    이진탐색 알고리즘의 연산횟수를 알아보자!



def BSearch(arr: list, id: int, target: int) :
	first = 0
	last = id - 1
	mid = 0
	cnt = 0
	
	while first <= last:
		mid = int((last + first) / 2)
		if arr[mid] == target: # if search target, return mid value
			return mid
		elif arr[mid] > target:
			last = mid - 1
		else:
			first = mid + 1
		cnt += 1
	print("Operating count : ", cnt) 
	
	# type chech

	#if type(mid) is int:
	#	print (mid)
	#else:
	#	print (mid)

	return -1

def main():
	arr1 = [int] * 500
	arr2 = [int] * 5000
	arr3 = [int] * 50000

	for i in range(0, 500):
		arr1[i] = 0;
	for i in range(0, 5000):
		arr2[i] = 0
	for i in range(0, 50000):
		arr3[i] = 0

	idx = BSearch(arr1, 500, 1)
	if idx == -1:
		print("fail!!!")
	else:
		print("target index : ", idx)

	idx = BSearch(arr2, 5000, 1)
	if idx == -1:
		print("fail!!!")
	else:
		print("target index : ", idx)

	idx = BSearch(arr3, 50000, 1)
	if idx == -1:
		print("fail!!!")
	else:
		print("target index : ", idx)

if __name__ == "__main__":
    main()