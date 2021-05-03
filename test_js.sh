#!/usr/bin/env bash

cd JavaScript

if [[ ! -d node_modules ]]; then
  npm install
fi

npm test

cd ..
