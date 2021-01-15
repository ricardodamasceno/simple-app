## Pod logs
kubectl logs -f (pod-name) (container-name)

## Deployment history
kubectl rollout history deployment (deployment-name)

## Change deployment message
kubectl annotate deployment (deplyment-name) kubernetes.io/change-cause="Message"

## Deployment rollback to specific version
kubectl rollout undo deployment (deployment-name) --to-revision=(deployment-version)

