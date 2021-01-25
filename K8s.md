## Pod logs
kubectl logs -f (pod-name) (container-name)

## Deployment history
kubectl rollout history deployment (deployment-name)

## Change deployment message
kubectl annotate deployment (deployment-name) kubernetes.io/change-cause="Message"

## Deployment rollback to specific version
kubectl rollout undo deployment (deployment-name) --to-revision=(deployment-version)

## Add metric server on minikube ( Necessary to use HPA )
minikube addons enable metrics-server

## Run stress-test.sh file 
bash stress-test.sh 0.001 > out.txt