#!/bin/bash
for i in {1..10000}; do
  curl 192.168.99.100:30000/rest/v1/home
  sleep $1
done