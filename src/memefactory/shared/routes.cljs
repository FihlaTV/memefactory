(ns memefactory.shared.routes)

(def routes [["/" :route/home]
             ["/marketplace/index" :route.marketplace/index]
             ["/dankregistry/index" :route.dank-registry/index]
             ["/dankregistry/submit" :route.dank-registry/submit]
             ["/dankregistry/vote" :route.dank-registry/vote]
             ["/dankregistry/challenge" :route.dank-registry/challenge]
             ["/dankregistry/browse" :route.dank-registry/browse]
             ["/memefolio/index" :route.memefolio/index]])
