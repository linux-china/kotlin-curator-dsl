Kotlin Curator DSL
====================

Kotlin DSL for Apache Curator to make ZooKeeper operation easy.

### Why DSL

The CuratorFramework uses a Fluent-style interface, and it's good. But DSL will make it easy to read and write.


### Curator Recipes

* Operations for path data, such as setData, getData, create etc
* Elections
* Leaders
* Barriers
* Counters
* Caches
* Nodes
* Queues

### Curator DSL

```
curator(curatorFramework) {
    getStringData("/xxx") {
       println(it)
    }
    lock("/xxx") {
    }
}
```

### TODO

* CuratorFramework class extension
* Curator Async
* Documentation

### References

* Curator: http://curator.apache.org/
* Curator Recipes: http://curator.apache.org/curator-recipes/index.html
* Kotlin: https://kotlinlang.org/
