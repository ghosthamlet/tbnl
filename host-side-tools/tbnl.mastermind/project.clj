(defproject info.voidstar/tbnl.mastermind "0.1.0-SNAPSHOT"
  :description "mastemind sits on host and controls figureheads on the device"
  :url "https://github.com/pw4ever/tbnl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/core.async "0.1.303.0-886421-alpha"]

                 [info.voidstar/tbnl.core "0.1.0-SNAPSHOT"]

                 [alembic "0.2.1"]

                 ]
  :main ^:skip-aot mastermind.main
  :target-path "target/%s"
  :profiles {
             :uberjar {:aot :all}
             }
  :aot :all
)
