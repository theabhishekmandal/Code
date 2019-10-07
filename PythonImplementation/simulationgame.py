from terminal import *
import sys

def next_step(grid,new_grid):
	"""
	 next_step : Computes the grid's next step and stores it in the list new_grid.
	 The latter needing to have been previously defined.
	"""

	# for each column in grid...
	for x in range(0,len(grid[0])):
		# Iterate through each line in grid
		for y in range(0, len(grid)):
			# count live cells around(x,y)
			live_neighbors = healthy_neighbors(x,y,grid)
			# Apply game of Life's rules
			if grid[y][x]:
				if live_neighbors <2 or live_neighbors >3:
					new_grid[x][y]=0
				else:
					new_grid[y][x]= grid[y][x]
			else:
				if live_neighbors == 3:
					new_grid[y][x] = 1

					
if __name__ == '__main__':
	# Define grid
	(width,height)=get_term_size()
	grid=[(width-5)*[0] for i in range(height-5)]


	#Draw initial grids
	update_screen(grid)

	#read initial config
	read_initial_conf(grid)

	#Step through grid
	prompt=('ITER %d Type anything to continue, the number of steps to'+
		'perform (or quit to exit): ')
	iter_step=1
	update_screen(grid)
	while True:
		# wait for user
		play=int(input('%s'%(prompt % iter_step)))

		if play == 'quit':
			break
		try:
			batch_steps = play
		except:
			batch_steps = 1
			pass
		for i in range(batch_steps):
			# Define auxiliary grid matrix
			new_grid = [len(grid[0])*[0] for i in range(len(grid))]
			# update grid
			next_step(grid,new_grid)
			grid,new_grid=grid,new_grid
			# Print updated grid
			update_screen(grid)
		iter_step+=batch_steps
