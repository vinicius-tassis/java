# List all containers (including stopped ones)
echo "Listing all containers:"
docker ps -a

# Stop all running containers
echo "Stopping all running containers:"
docker stop $(docker ps -q)


# Remove all containers
echo "Removing all containers:"
docker rm $(docker ps -a -q)

# Prune containers, networks, images (both dangling and unreferenced), and build cache
echo "Pruning unused Docker objects:"
docker system prune -f

# List all images
echo "Listing all Docker images:"
docker images

# Remove all Docker images
echo "Removing all Docker images:"
docker rmi -f $(docker images -q)
