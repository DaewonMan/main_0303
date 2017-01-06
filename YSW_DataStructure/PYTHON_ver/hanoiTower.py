#
#  I try to understand recersion of hanoitower
#
#

def hanoiTowerMove(num: int, froms, by, to):
	if num == 1:
		print("first disk is from ", froms, "to ", to)
	else:
		hanoiTowerMove(num-1, froms, to, by)	
		print(num, "th disk from ", froms, "to ", to)
		hanoiTowerMove(num-1, by, froms, to)

def main():
	hanoiTowerMove(3, 'A', 'B', 'C') # Move from stick A to stick B

if __name__ == "__main__":
	main()