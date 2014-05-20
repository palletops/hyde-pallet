{:namespaces ({:vars ({:ns pallet.action.impl,
                       :name make-action,
                       :file "pallet/action/impl.clj",
                       :column 1,
                       :line 19,
                       :var-type :fn,
                       :arglists ([action-symbol options]),
                       :doc "Function to create an action. The action will have no initial\n  implementations."}
                      {:ns pallet.action.impl,
                       :name action-implementation,
                       :file "pallet/action/impl.clj",
                       :column 1,
                       :line 37,
                       :var-type :fn,
                       :arglists ([action dispatch-val default]
                                  [action dispatch-val]),
                       :doc "Return the action implementation for an action."}
                      {:ns pallet.action.impl,
                       :name action-symbol,
                       :file "pallet/action/impl.clj",
                       :column 1,
                       :line 27,
                       :var-type :fn,
                       :arglists ([action]),
                       :doc "Return the action's symbol."}
                      {:ns pallet.action.impl,
                       :name add-action-implementation!,
                       :file "pallet/action/impl.clj",
                       :column 1,
                       :line 45,
                       :var-type :fn,
                       :arglists ([action dispatch-val metadata f]),
                       :doc "Add an action implementation for an action."}
                      {:ns pallet.action.impl,
                       :name action-options,
                       :file "pallet/action/impl.clj",
                       :column 1,
                       :line 32,
                       :var-type :fn,
                       :arglists ([action]),
                       :doc "Return the options for the action."}),
               :ns-name pallet.action.impl,
               :doc "Provides a data structure for pallet's actions. This is the internal\n  representation of an action. User code should use pallet.action, where actions\n  are represented via the functions that insert them into the session action\n  plan.\n\n  Each action has a symbol associated with an action is used in error messages.\n  The symbol does not have to resolve to a var.\n\n  The `execution` specifies the execution model for the action.\n\n  Each implementation is represented as a map of metadata and function. The map\n  is stored in a map in an atom on the ::impls key of the metadata of the\n  action, keyed by the dispatch value. This allows for the implementation\n  function to be an anonymous named function, while still having metadata\n  associated with it."}
              {:vars ({:private true,
                       :ns pallet.action,
                       :name args-with-map-as,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 77,
                       :var-type :fn,
                       :arglists ([args]),
                       :doc "Ensures that an argument map contains an :as element, by which the map can be\n  referenced."}
                      {:ns pallet.action,
                       :name implementation,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 165,
                       :var-type :fn,
                       :arglists ([{:keys [action], :as action-map}
                                   dispatch-val]),
                       :doc "Returns the metadata and function for an implementation of an action from an\n  action map."}
                      {:ns pallet.action,
                       :name action-execute,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 51,
                       :var-type :fn,
                       :arglists ([session action argv]),
                       :doc "Call the session executor for the action with argv."}
                      {:indent defun,
                       :ns pallet.action,
                       :name defaction,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 111,
                       :macro true,
                       :var-type :macro,
                       :arglists [[action-name attr-map? [params*]]],
                       :doc "Declares a named action.  The action has defonce semantics, so\n  implementations are not lost on recompiles."}
                      {:ns pallet.action,
                       :name action-map,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 23,
                       :var-type :fn,
                       :arglists ([action arg-vector options]),
                       :doc "Return an action map for the given `action` and `args`. The action\n   map is an instance of an action.  The returned map has the\n   following keys:\n\n   - :action          the action that is scheduled,\n   - :args            the arguments to pass to the action function,"}
                      {:ns pallet.action,
                       :name declare-action,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 70,
                       :var-type :fn,
                       :arglists ([action-symbol options]),
                       :doc "Declare an action. The action-name is a symbol (not necessarily referring to\n  a Var).  Returns an executor function for the action."}
                      {:private true,
                       :ns pallet.action,
                       :name arg-values,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 83,
                       :var-type :fn,
                       :arglists ([symbolic-args]),
                       :doc "Converts a symbolic argument list into a compatible argument vector for\n   passing to a function with the same signature."}
                      {:ns pallet.action,
                       :name action-fn,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 180,
                       :var-type :fn,
                       :arglists ([action dispatch-val]),
                       :doc "Returns the function for an implementation of an action from an action\n   inserter."}
                      {:ns pallet.action,
                       :name implement-action,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 137,
                       :var-type :fn,
                       :arglists ([action-inserter
                                   dispatch-val
                                   metadata
                                   script-data
                                   f]
                                  [action-inserter
                                   dispatch-val
                                   metadata
                                   f]),
                       :doc "Define an implementation of an action given the `action-inserter`\n  action function."}
                      {:ns pallet.action,
                       :name effective-user,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 35,
                       :var-type :fn,
                       :arglists ([user action-options]),
                       :doc "Return a user map for the effective user for an action."}
                      {:private true,
                       :ns pallet.action,
                       :name action-execute-fn,
                       :file "pallet/action.clj",
                       :column 1,
                       :line 61,
                       :var-type :fn,
                       :arglists ([action]),
                       :doc "Return a function that will call the session executor for the\n  action with argv."}),
               :ns-name pallet.action,
               :doc "Actions are the primitives that are called by phase functions.\n\n   Actions can have multiple implementations, but by default most are\n   implemented as script."}
              {:vars ({:ns pallet.action-options,
                       :name with-action-options,
                       :file "pallet/action_options.clj",
                       :column 1,
                       :line 28,
                       :macro true,
                       :var-type :macro,
                       :arglists ([session m & body]),
                       :doc "Set up local options for actions, and allow override of user\noptions.\n\n`:script-dir`\n: Controls the directory the script is executed in.\n\n`:sudo-user`\n: Controls the user the action runs as.\n\n`:script-prefix`\n: Specify a prefix for the script. Disable sudo using `:no-sudo`. Defaults to\n  `:sudo`.\n\n`:script-env`\n: Specify a map of environment variables.\n\n`:script-comments`\n: Control the generation of script line number comments\n\n`:new-login-after-action`\n: Force a new ssh login after the action.  Useful if the action effects the\n  login environment and you want the affect to be visible immediately.\n\n`:record-all`\n: control the recording of action-option results.  When set to false,\nonly the action summary and any error is recorded.  Defaults to true."}
                      {:ns pallet.action-options,
                       :name action-options,
                       :file "pallet/action_options.clj",
                       :column 1,
                       :line 23,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Return any action-options currently defined on the session."}
                      {:ns pallet.action-options,
                       :name ActionOptions,
                       :file "pallet/action_options.clj",
                       :column 1,
                       :line 10,
                       :var-type :var}),
               :ns-name pallet.action-options,
               :doc "Options for controlling the behaviour of actions."}
              {:vars ({:var-type :fn,
                       :ns pallet.actions.decl,
                       :name user,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 62,
                       :arglists [[session username options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name wait-for-file,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 58,
                       :arglists [[session path options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name service,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 65,
                       :arglists [[session service-name options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name debconf-set-selections,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 36,
                       :arglists [[session options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name package,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 28,
                       :arglists [[session package-name options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name group,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 61,
                       :arglists [[session groupname options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name fifo,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 41,
                       :arglists [[session path options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name transfer-file-to-local,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 52,
                       :arglists [[session remote-path local-path]],
                       :doc "Function to transfer a remote file to a local path."}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name transfer-file,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 47,
                       :arglists [[session local-path remote-path]],
                       :doc "Function to transfer a local file to a remote path.\nPrefer remote-file or remote-directory over direct use of this action."}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name package-manager,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 30,
                       :arglists [[session action options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name rsync-to-local,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 69,
                       :arglists [[session
                                   remote-path
                                   local-path
                                   options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name exec,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 16,
                       :arglists [[session
                                   {:keys [language
                                           interpreter
                                           version],
                                    :or {language :bash}}
                                   script]],
                       :doc "Execute script on the target node. The `script` is a plain string. `type`\n   specifies the script language (default :bash). You can override the\n   interpreter path using the `:interpreter` option."}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name directory,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 44,
                       :arglists [[session dir-path options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name remote-directory,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 57,
                       :arglists [[session path options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name exec-script*,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 22,
                       :arglists [[session script]],
                       :doc "Execute script on the target node. The script is a plain string."}
                      {:ns pallet.actions.decl,
                       :name package-source-changed-flag,
                       :file "pallet/actions/decl.clj",
                       :column 1,
                       :line 27,
                       :var-type :var}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name file,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 39,
                       :arglists [[session path options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name package-repository,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 31,
                       :arglists [[packager options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name symbolic-link,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 40,
                       :arglists [[session from name options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name package-source,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 32,
                       :arglists [[session name options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name add-rpm,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 34,
                       :arglists [[session rpm-name options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name remote-file,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 56,
                       :arglists [[session path options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name sed,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 42,
                       :arglists [[session path exprs-map options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name rsync,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 68,
                       :arglists [[session
                                   local-path
                                   remote-path
                                   options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name packages,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 29,
                       :arglists [[session package-names options]]}
                      {:var-type :fn,
                       :ns pallet.actions.decl,
                       :name install-deb,
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 35,
                       :arglists [[session deb-name options]]}),
               :ns-name pallet.actions.decl,
               :doc "Action declarations"}
              {:vars ({:ns pallet.actions.direct.directory,
                       :name make-directory,
                       :file "pallet/actions/direct/directory.clj",
                       :column 1,
                       :line 27,
                       :var-type :fn,
                       :arglists ([dir-path
                                   &
                                   {:keys [path
                                           verbose
                                           mode
                                           recursive],
                                    :as opts}]),
                       :doc "Script to create a directory."}
                      {:ns pallet.actions.direct.directory,
                       :name adjust-directory,
                       :file "pallet/actions/direct/directory.clj",
                       :column 1,
                       :line 11,
                       :var-type :fn,
                       :arglists ([path
                                   {:keys [owner group mode recursive],
                                    :as opts}]),
                       :doc "Script to set the ownership and mode of a directory."}
                      {:ns pallet.actions.direct.directory,
                       :name directory*,
                       :file "pallet/actions/direct/directory.clj",
                       :column 1,
                       :line 36,
                       :var-type :fn,
                       :arglists ([{:keys [action-options state]}
                                   dir-path
                                   {:keys [action
                                           recursive
                                           force
                                           path
                                           mode
                                           verbose
                                           owner
                                           group],
                                    :or {action :create,
                                         recursive true,
                                         force true,
                                         path true},
                                    :as options}])}),
               :ns-name pallet.actions.direct.directory,
               :doc "A directory manipulation action, to create and remove directories\n   with given ownership and mode."}
              {:vars ({:ns pallet.actions.direct.exec-script,
                       :name exec-script**,
                       :file "pallet/actions/direct/exec_script.clj",
                       :column 1,
                       :line 15,
                       :var-type :fn,
                       :arglists ([_ script])}
                      {:ns pallet.actions.direct.exec-script,
                       :name exec*,
                       :file "pallet/actions/direct/exec_script.clj",
                       :column 1,
                       :line 7,
                       :var-type :fn,
                       :arglists ([_
                                   {:keys [language
                                           interpreter
                                           version],
                                    :or {language :bash},
                                    :as options}
                                   script])}),
               :ns-name pallet.actions.direct.exec-script,
               :doc "Script execution. Script generation occurs with the correct script context."}
              {:vars ({:ns pallet.actions.direct.execute,
                       :name status-line?,
                       :file "pallet/actions/direct/execute.clj",
                       :column 1,
                       :line 27,
                       :var-type :fn,
                       :arglists ([line])}
                      {:ns pallet.actions.direct.execute,
                       :name result-with-error-map,
                       :file "pallet/actions/direct/execute.clj",
                       :column 1,
                       :line 68,
                       :var-type :fn,
                       :arglists ([server
                                   msg
                                   {:keys [exit], :as result}]),
                       :doc "Verify the return code of a script execution, and add an error map if\n   there is a non-zero result :exit"}
                      {:ns pallet.actions.direct.execute,
                       :name log-script-output,
                       :file "pallet/actions/direct/execute.clj",
                       :column 1,
                       :line 35,
                       :var-type :fn,
                       :arglists ([server user]),
                       :doc "Return a function to log (multi-line) script output, removing passwords."}
                      {:ns pallet.actions.direct.execute,
                       :name normalise-eol,
                       :file "pallet/actions/direct/execute.clj",
                       :column 1,
                       :line 11,
                       :var-type :fn,
                       :arglists ([s]),
                       :doc "Convert eol into platform specific value"}
                      {:ns pallet.actions.direct.execute,
                       :name script-error-map,
                       :file "pallet/actions/direct/execute.clj",
                       :column 1,
                       :line 50,
                       :var-type :fn,
                       :arglists ([server msg result]),
                       :doc "Create an error map for a script execution"}
                      {:ns pallet.actions.direct.execute,
                       :name strip-sudo-password,
                       :file "pallet/actions/direct/execute.clj",
                       :column 1,
                       :line 16,
                       :var-type :fn,
                       :arglists ([s user]),
                       :doc "Elides the user's password or sudo-password from the given script output."}
                      {:ns pallet.actions.direct.execute,
                       :name clean-logs,
                       :file "pallet/actions/direct/execute.clj",
                       :column 1,
                       :line 22,
                       :var-type :fn,
                       :arglists ([user]),
                       :doc "Clean passwords from logs"}
                      {:ns pallet.actions.direct.execute,
                       :name status-lines,
                       :file "pallet/actions/direct/execute.clj",
                       :column 1,
                       :line 30,
                       :var-type :fn,
                       :arglists ([lines]),
                       :doc "Return script status lines from the given sequence of lines."}),
               :ns-name pallet.actions.direct.execute,
               :doc "Execute actions."}
              {:vars ({:ns pallet.actions.direct.file,
                       :name file*,
                       :file "pallet/actions/direct/file.clj",
                       :column 1,
                       :line 40,
                       :var-type :fn,
                       :arglists ([{:keys [action-options state]}
                                   path
                                   {:keys [action
                                           owner
                                           group
                                           mode
                                           force],
                                    :or {action :create, force true},
                                    :as options}])}
                      {:ns pallet.actions.direct.file,
                       :name fifo*,
                       :file "pallet/actions/direct/file.clj",
                       :column 1,
                       :line 74,
                       :var-type :fn,
                       :arglists ([{:keys [action-options state]}
                                   path
                                   {:keys [action
                                           owner
                                           group
                                           mode
                                           force],
                                    :or {action :create},
                                    :as options}])}
                      {:ns pallet.actions.direct.file,
                       :name write-md5-for-file,
                       :file "pallet/actions/direct/file.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([path md5-path]),
                       :doc "Create a .md5 file for the specified input file"}
                      {:ns pallet.actions.direct.file,
                       :name sed*,
                       :file "pallet/actions/direct/file.clj",
                       :column 1,
                       :line 91,
                       :var-type :fn,
                       :arglists ([{:keys [action-options state]}
                                   path
                                   exprs-map
                                   {:keys [seperator
                                           no-md5
                                           restriction],
                                    :as options}])}
                      {:ns pallet.actions.direct.file,
                       :name symbolic-link*,
                       :file "pallet/actions/direct/file.clj",
                       :column 1,
                       :line 58,
                       :var-type :fn,
                       :arglists ([{:keys [action-options state]}
                                   from
                                   name
                                   &
                                   {:keys [action
                                           owner
                                           group
                                           mode
                                           force
                                           no-deref],
                                    :or {action :create, force true}}])}
                      {:ns pallet.actions.direct.file,
                       :name touch-file,
                       :file "pallet/actions/direct/file.clj",
                       :column 1,
                       :line 33,
                       :var-type :fn,
                       :arglists ([path {:keys [force], :as options}])}
                      {:ns pallet.actions.direct.file,
                       :name adjust-file,
                       :file "pallet/actions/direct/file.clj",
                       :column 1,
                       :line 10,
                       :var-type :fn,
                       :arglists ([path options])}),
               :ns-name pallet.actions.direct.file,
               :doc "File manipulation."}
              {:vars ({:ns pallet.actions.direct.package,
                       :name install-deb*,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 570,
                       :var-type :fn,
                       :arglists ([action-options
                                   deb-name
                                   &
                                   {:as options}])}
                      {:var-type :multi-method,
                       :ns pallet.actions.direct.package,
                       :name format-source,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 263,
                       :doc "Format a package source definition"}
                      {:ns pallet.actions.direct.package,
                       :name ubuntu-ppa-add,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 307,
                       :var-type :var}
                      {:ns pallet.actions.direct.package,
                       :name package*,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 234,
                       :var-type :fn,
                       :arglists ([action-state package-name options])}
                      {:ns pallet.actions.direct.package,
                       :name add-scope*,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 402,
                       :var-type :fn,
                       :arglists ([type scope file]),
                       :doc "Add a scope to all the existing package sources. Aptitude specific."}
                      {:ns pallet.actions.direct.package,
                       :name package-repository*,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 394,
                       :var-type :fn,
                       :arglists ([action-options options])}
                      {:ns pallet.actions.direct.package,
                       :name source-location,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 258,
                       :var-type :var}
                      {:ns pallet.actions.direct.package,
                       :name default-installonlypkgs,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 449,
                       :var-type :var}
                      {:var-type :multi-method,
                       :ns pallet.actions.direct.package,
                       :name adjust-packages,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 31}
                      {:ns pallet.actions.direct.package,
                       :name add-scope,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 413,
                       :var-type :fn,
                       :arglists ([opts]),
                       :doc "Add a scope to an apt source"}
                      {:ns pallet.actions.direct.package,
                       :name add-rpm*,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 551,
                       :var-type :fn,
                       :arglists ([action-options
                                   rpm-name
                                   &
                                   {:as options}])}
                      {:var-type :multi-method,
                       :ns pallet.actions.direct.package,
                       :name configure-package-manager,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 421,
                       :doc "Configure the package manager"}
                      {:private true,
                       :ns pallet.actions.direct.package,
                       :name aptitude-escape-map,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 36,
                       :var-type :var}
                      {:var-type :multi-method,
                       :ns pallet.actions.direct.package,
                       :name package-manager-option,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 425,
                       :doc "Provide packager specific options"}
                      {:ns pallet.actions.direct.package,
                       :name *default-apt-keyserver*,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :dynamic true,
                       :line 300,
                       :var-type :var}
                      {:var-type :multi-method,
                       :ns pallet.actions.direct.package,
                       :name package-source*,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 302,
                       :doc "Add a packager source."}
                      {:private true,
                       :ns pallet.actions.direct.package,
                       :name package-source-apt,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 313,
                       :var-type :fn,
                       :arglists ([name
                                   {:keys [key-id
                                           key-server
                                           key-url
                                           url],
                                    :as options}])}
                      {:private true,
                       :ns pallet.actions.direct.package,
                       :name package-map,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 219,
                       :var-type :fn,
                       :arglists ([package-name
                                   {:keys [action
                                           y
                                           force
                                           purge
                                           priority
                                           enable
                                           disable
                                           allow-unsigned],
                                    :as options}]),
                       :doc "Convert the args into a single map"}
                      {:ns pallet.actions.direct.package,
                       :name package-manager*,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 527,
                       :var-type :fn,
                       :arglists ([action-state
                                   action
                                   {:keys [packager packages scope],
                                    :as options}]),
                       :doc "Package management."}
                      {:ns pallet.actions.direct.package,
                       :name debconf-set-selections*,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 587,
                       :var-type :fn,
                       :arglists ([action-options
                                   {:keys [line
                                           package
                                           question
                                           type
                                           value]}])}
                      {:ns pallet.actions.direct.package,
                       :name packages*,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 246,
                       :var-type :fn,
                       :arglists ([action-state package-names options])}
                      {:private true,
                       :ns pallet.actions.direct.package,
                       :name action-order,
                       :file "pallet/actions/direct/package.clj",
                       :column 1,
                       :line 167,
                       :var-type :var,
                       :doc "Define the order of actions"}),
               :ns-name pallet.actions.direct.package,
               :doc "Package management action.\n\n   `package` is used to install or remove a package.\n\n   `package-source` is used to specify a non-standard source for packages."}
              {:vars ({:ns pallet.actions.direct.remote-directory,
                       :name remote-directory*,
                       :file "pallet/actions/direct/remote_directory.clj",
                       :column 1,
                       :line 33,
                       :var-type :fn,
                       :arglists ([action-state
                                   path
                                   {:keys [action
                                           url
                                           local-file
                                           remote-file
                                           unpack
                                           tar-options
                                           unzip-options
                                           jar-options
                                           strip-components
                                           md5
                                           md5-url
                                           owner
                                           group
                                           recursive
                                           install-new-files
                                           overwrite-changes
                                           extract-files],
                                    :or {action :create,
                                         tar-options "xz",
                                         unzip-options "-o",
                                         jar-options "xf",
                                         strip-components 1,
                                         recursive true,
                                         install-new-files true},
                                    :as options}])}
                      {:private true,
                       :ns pallet.actions.direct.remote-directory,
                       :name source-to-cmd-and-path,
                       :file "pallet/actions/direct/remote_directory.clj",
                       :column 1,
                       :line 15,
                       :var-type :fn,
                       :arglists ([action-state
                                   uploader
                                   path
                                   url
                                   local-file
                                   remote-file
                                   md5
                                   md5-url
                                   install-new-files
                                   overwrite-changes])}),
               :ns-name pallet.actions.direct.remote-directory,
               :doc "Action to specify the content of a remote directory.  At present the\n   content can come from a downloaded tar or zip file."}
              {:vars ({:ns pallet.actions.direct.remote-file,
                       :name transfer-file*,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 54,
                       :var-type :fn,
                       :arglists ([{:keys [options]}
                                   local-path
                                   remote-path])}
                      {:ns pallet.actions.direct.remote-file,
                       :name file-uploader,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 31,
                       :var-type :fn,
                       :arglists ([action-options])}
                      {:ns pallet.actions.direct.remote-file,
                       :name remote-file*,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 77,
                       :var-type :fn,
                       :arglists ([action-state
                                   path
                                   {:keys [action
                                           url
                                           local-file
                                           remote-file
                                           link
                                           content
                                           literal
                                           template
                                           values
                                           md5
                                           md5-url
                                           owner
                                           group
                                           mode
                                           force
                                           blob
                                           blobstore
                                           install-new-files
                                           overwrite-changes
                                           no-versioning
                                           max-versions
                                           flag-on-changed
                                           force
                                           insecure
                                           verify
                                           proxy],
                                    :or {action :create,
                                         max-versions 5,
                                         install-new-files true},
                                    :as options}])}
                      {:ns pallet.actions.direct.remote-file,
                       :name transfer-file-to-local*,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 46,
                       :var-type :fn,
                       :arglists ([{:keys [options]}
                                   remote-path
                                   local-path])}
                      {:ns pallet.actions.direct.remote-file,
                       :name file-checksum,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 36,
                       :var-type :fn,
                       :arglists ([action-options])}
                      {:ns pallet.actions.direct.remote-file,
                       :name default-checksum,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 28,
                       :var-type :var}
                      {:ns pallet.actions.direct.remote-file,
                       :name default-backup,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 29,
                       :var-type :var}
                      {:ns pallet.actions.direct.remote-file,
                       :name file-backup,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 41,
                       :var-type :fn,
                       :arglists ([action-options])}
                      {:private true,
                       :ns pallet.actions.direct.remote-file,
                       :name summarise-content,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 70,
                       :var-type :fn,
                       :arglists ([m])}
                      {:ns pallet.actions.direct.remote-file,
                       :name default-file-uploader,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 27,
                       :var-type :var}
                      {:ns pallet.actions.direct.remote-file,
                       :name wait-for-file*,
                       :file "pallet/actions/direct/remote_file.clj",
                       :column 1,
                       :line 240,
                       :var-type :fn,
                       :arglists ([action-state
                                   path
                                   {:keys [action
                                           max-retries
                                           standoff
                                           service-name],
                                    :or {action :create,
                                         max-retries 5,
                                         standoff 2},
                                    :as options}])}),
               :ns-name pallet.actions.direct.remote-file,
               :doc "Action to specify remote file content."}
              {:vars (),
               :ns-name pallet.actions.direct.retry,
               :doc "Provides an action that can be repeated if it fails"}
              {:vars ({:private true,
                       :ns pallet.actions.direct.rsync,
                       :name cmd-to-local,
                       :file "pallet/actions/direct/rsync.clj",
                       :column 1,
                       :line 13,
                       :var-type :var}
                      {:ns pallet.actions.direct.rsync,
                       :name rsync*,
                       :file "pallet/actions/direct/rsync.clj",
                       :column 1,
                       :line 38,
                       :var-type :fn,
                       :arglists ([{:keys [action-options state]}
                                   from
                                   to
                                   {:keys [ip username port],
                                    :as options}])}
                      {:ns pallet.actions.direct.rsync,
                       :name rsync-to-local*,
                       :file "pallet/actions/direct/rsync.clj",
                       :column 1,
                       :line 53,
                       :var-type :fn,
                       :arglists ([{:keys [action-options state]}
                                   from
                                   to
                                   {:keys [ip username port],
                                    :as options}])}
                      {:ns pallet.actions.direct.rsync,
                       :name rsync-command,
                       :file "pallet/actions/direct/rsync.clj",
                       :column 1,
                       :line 25,
                       :var-type :fn,
                       :arglists ([from
                                   to
                                   username
                                   address
                                   port
                                   options])}
                      {:ns pallet.actions.direct.rsync,
                       :name default-options,
                       :file "pallet/actions/direct/rsync.clj",
                       :column 1,
                       :line 16,
                       :var-type :fn,
                       :arglists ([action-options])}
                      {:private true,
                       :ns pallet.actions.direct.rsync,
                       :name cmd,
                       :file "pallet/actions/direct/rsync.clj",
                       :column 1,
                       :line 10,
                       :var-type :var}),
               :ns-name pallet.actions.direct.rsync}
              {:vars ({:var-type :multi-method,
                       :ns pallet.actions.direct.service,
                       :name service-impl,
                       :file "pallet/actions/direct/service.clj",
                       :column 1,
                       :line 16}
                      {:ns pallet.actions.direct.service,
                       :name init-script-path,
                       :file "pallet/actions/direct/service.clj",
                       :column 1,
                       :line 11,
                       :var-type :fn,
                       :arglists ([service-name]),
                       :doc "Path to the specified initd script"}),
               :ns-name pallet.actions.direct.service,
               :doc "Service control. Deprecated in favour of pallet.crate.service."}
              {:vars ({:ns pallet.actions.direct.user,
                       :name group*,
                       :file "pallet/actions/direct/user.clj",
                       :column 1,
                       :line 65,
                       :var-type :fn,
                       :arglists ([{:keys [action-options state]}
                                   groupname
                                   {:keys [action system gid password],
                                    :or {action :manage},
                                    :as options}])}
                      {:private true,
                       :ns pallet.actions.direct.user,
                       :name shell-names,
                       :file "pallet/actions/direct/user.clj",
                       :column 1,
                       :line 11,
                       :var-type :var,
                       :doc "Map for looking up shell path based on keyword."}
                      {:ns pallet.actions.direct.user,
                       :name user*,
                       :file "pallet/actions/direct/user.clj",
                       :column 1,
                       :line 17,
                       :var-type :fn,
                       :arglists ([{:keys [action-options state]}
                                   username
                                   {:keys [action
                                           shell
                                           base-dir
                                           home
                                           system
                                           create-home
                                           password
                                           shell
                                           comment
                                           groups
                                           remove
                                           force
                                           append],
                                    :or {action :manage},
                                    :as options}]),
                       :doc "Require a user"}),
               :ns-name pallet.actions.direct.user,
               :doc "User management action."}
              {:vars ({:ns pallet.actions.direct,
                       :name direct-script,
                       :file "pallet/actions/direct.clj",
                       :column 1,
                       :line 22,
                       :var-type :fn,
                       :arglists ([{:keys [options args], :as action}
                                   state-map]),
                       :doc "Execute the direct action implementation, which returns script or other\n  argument data, and metadata."}),
               :ns-name pallet.actions.direct,
               :doc "Direct execution action implementations.\n\nThe :direct implementation of actions is designed to return script\nthat will be executed on the remote target."}
              {:vars ({:var-type :multi-method,
                       :ns pallet.actions.impl,
                       :name service-script-path,
                       :file "pallet/actions/impl.clj",
                       :column 1,
                       :line 38}
                      {:no-doc true,
                       :ns pallet.actions.impl,
                       :name context-string,
                       :file "pallet/actions/impl.clj",
                       :column 1,
                       :line 50,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "The string that is used to represent the phase context for :in-sequence\n  actions."}
                      {:ns pallet.actions.impl,
                       :name *install-new-files*,
                       :file "pallet/actions/impl.clj",
                       :column 1,
                       :dynamic true,
                       :line 26,
                       :var-type :var,
                       :doc "Var to control installation of new file content on remote nodes."}
                      {:ns pallet.actions.impl,
                       :name *force-overwrite*,
                       :file "pallet/actions/impl.clj",
                       :column 1,
                       :dynamic true,
                       :line 30,
                       :var-type :var,
                       :doc "Var to control overwriting of modified file content on remote\n             nodes."}
                      {:ns pallet.actions.impl,
                       :name verify-local-file-exists,
                       :file "pallet/actions/impl.clj",
                       :column 1,
                       :line 15,
                       :var-type :fn,
                       :arglists ([local-file])}
                      {:ns pallet.actions.impl,
                       :name checked-commands,
                       :file "pallet/actions/impl.clj",
                       :column 1,
                       :line 74,
                       :var-type :fn,
                       :arglists ([name & script]),
                       :doc "Return a stevedore script that uses the current context to label the\n   action"}
                      {:ns pallet.actions.impl,
                       :name *script-location-info*,
                       :file "pallet/actions/impl.clj",
                       :column 1,
                       :dynamic true,
                       :line 13,
                       :var-type :var}
                      {:ns pallet.actions.impl,
                       :name checked-script,
                       :file "pallet/actions/impl.clj",
                       :column 1,
                       :line 58,
                       :macro true,
                       :var-type :macro,
                       :arglists ([name & script]),
                       :doc "Return a stevedore script that uses the current context to label the\n   action"}
                      {:ns pallet.actions.impl,
                       :name checked-commands*,
                       :file "pallet/actions/impl.clj",
                       :column 1,
                       :line 66,
                       :macro true,
                       :var-type :macro,
                       :arglists ([name scripts]),
                       :doc "Return a stevedore script that uses the current context to label the\n   action"}),
               :ns-name pallet.actions.impl,
               :doc "Implementation namespace for Pallet's action primitives."}
              {:vars ({:ns pallet.actions,
                       :name remote-directory-arguments,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 213,
                       :var-type :var}
                      {:ns pallet.actions,
                       :name retry-until,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 866,
                       :macro true,
                       :var-type :macro,
                       :arglists ([session
                                   {:keys [max-retries
                                           standoff
                                           service-name],
                                    :or {max-retries 5, standoff 2}}
                                   condition]),
                       :doc "Repeat an action until it succeeds"}
                      {:ns pallet.actions,
                       :name PackageOptions,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 549,
                       :var-type :var}
                      {:ns pallet.actions,
                       :name with-service-restart,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 821,
                       :macro true,
                       :var-type :macro,
                       :arglists ([session service-name & body]),
                       :doc "Stop the given service, execute the body, and then restart."}
                      {:no-doc true,
                       :ns pallet.actions,
                       :name loop-until,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 847,
                       :var-type :fn,
                       :arglists ([session
                                   service-name
                                   condition
                                   max-retries
                                   standoff])}
                      {:ns pallet.actions,
                       :name user,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 756,
                       :var-type :fn,
                       :arglists ([session
                                   username
                                   {:keys [action
                                           shell
                                           base-dir
                                           home
                                           system
                                           create-home
                                           password
                                           shell
                                           comment
                                           group
                                           groups
                                           remove
                                           force
                                           append],
                                    :or {action :manage},
                                    :as options}]
                                  [session username]),
                       :doc "User management.\n\n`:action`\n: One of :create, :manage, :lock, :unlock or :remove.\n\n`:shell`\n: One of :bash, :csh, :ksh, :rsh, :sh, :tcsh, :zsh, :false or a path string.\n\n`:create-home`\n: Controls creation of the user's home directory.\n\n`:base-dir`\n: The directory in which default user directories should be created.\n\n`:home`\n: Specify the user's home directory.\n\n`:system`\n: Specify the user as a system user.\n\n`:comment`\n: A comment to record for the user.\n\n`:group`\n: The user's login group. Defaults to a group with the same name as the user.\n\n`:groups`\n: Additional groups the user should belong to.\n\n`:password`\n: An MD5 crypted password for the user.\n\n`:force`\n: Force user removal."}
                      {:ns pallet.actions,
                       :name wait-for-file,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 531,
                       :var-type :fn,
                       :arglists ([session
                                   path
                                   {:keys [max-retries
                                           standoff
                                           service-name],
                                    :or {action :create,
                                         max-versions 5,
                                         install-new-files true},
                                    :as options}]
                                  [session path]),
                       :doc "Wait for a file to exist"}
                      {:ns pallet.actions,
                       :name ownership-options,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 170,
                       :var-type :var,
                       :doc "A vector of options for controlling ownership. Can be used for option\n          forwarding when calling remote-file from other crates."}
                      {:ns pallet.actions,
                       :name rsync-to-local-directory,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 728,
                       :var-type :fn,
                       :arglists ([session
                                   from
                                   to
                                   &
                                   {:keys [owner group mode port],
                                    :as options}]),
                       :doc "Rsync from a local directory to a remote directory."}
                      {:ns pallet.actions,
                       :name service,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 801,
                       :var-type :fn,
                       :arglists ([session
                                   service-name
                                   {:keys [action
                                           if-flag
                                           if-stopped
                                           service-impl],
                                    :or {action :start,
                                         service-impl :initd},
                                    :as options}]
                                  [session service-name]),
                       :doc "Control services.\n\n   - :action  accepts either startstop, restart, enable or disable keywords.\n   - :if-flag  makes start, stop, and restart conditional on the specified flag\n               as set, for example, by remote-file :flag-on-changed\n   - :sequence-start  a sequence of [sequence-number level level ...], where\n                      sequence number determines the order in which services\n                      are started within a level.\n   - :service-impl    either :initd or :upstart\n\nDeprecated in favour of pallet.crate.service/service."}
                      {:ns pallet.actions,
                       :name debconf-set-selections,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 684,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [line
                                           package
                                           question
                                           type
                                           value],
                                    :as options}]),
                       :doc "Set debconf selections.\nSpecify `:line` as a string, or `:package`, `:question`, `:type` and\n`:value` options."}
                      {:ns pallet.actions,
                       :name exec-checked-script,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 33,
                       :macro true,
                       :var-type :macro,
                       :arglists ([session script-name & script]),
                       :doc "Execute a bash script remotely, throwing if any element of the\n   script fails. The script is expressed in stevedore."}
                      {:ns pallet.actions,
                       :name package,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 582,
                       :var-type :fn,
                       :arglists ([session
                                   package-name
                                   {:keys [action
                                           y
                                           force
                                           purge
                                           enable
                                           disable
                                           priority],
                                    :or {action :install,
                                         y true,
                                         priority 50},
                                    :as options}]
                                  [session package-name]),
                       :doc "Install or remove a package.\n\n   Options\n    - :action [:install | :remove | :upgrade]\n    - :purge [true|false]         when removing, whether to remove all config\n    - :enable [repo|(seq repo)]   enable specific repository\n    - :disable [repo|(seq repo)]  disable specific repository\n    - :priority n                 priority (0-100, default 50)\n    - :disable-service-start      disable service startup (default false)\n    - :allow-unsigned             install package even if unsigned\n\n   For package management to occur in one shot, use pallet.crate.package."}
                      {:ns pallet.actions,
                       :name on-one-node,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 887,
                       :macro true,
                       :var-type :macro,
                       :arglists ([session roles & body]),
                       :doc "Execute the body on just one node of the specified roles. If there is no\n   node in the union of nodes for all the roles, the nodes for the first role\n   are used."}
                      {:ns pallet.actions,
                       :name check-remote-file-arguments,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 209,
                       :var-type :fn,
                       :arglists ([m])}
                      {:ns pallet.actions,
                       :name group,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 735,
                       :var-type :fn,
                       :arglists ([session
                                   groupname
                                   {:keys [action system gid password],
                                    :or {action :manage},
                                    :as options}]
                                  [session groupname]),
                       :doc "User Group Management.\n\n`:action`\n: One of :create, :manage, :remove.\n\n`:gid`\n: specify the group id\n\n`:password`\n: An MD5 crypted password for the user.\n\n`:system`\n: Specify the user as a system user."}
                      {:ns pallet.actions,
                       :name fifo,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 88,
                       :var-type :fn,
                       :arglists ([session
                                   path
                                   {:keys [action
                                           owner
                                           group
                                           mode
                                           force],
                                    :or {action :create},
                                    :as options}]),
                       :doc "FIFO pipe management.\n\n     - :action    one of :create, :delete\n     - :owner     user name or id for owner of fifo\n     - :group     user name or id for group of fifo\n     - :mode      fifo permissions\n     - :force     when deleting, try and force removal"}
                      {:var-type :multi-method,
                       :ns pallet.actions,
                       :name repository,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 691,
                       :doc "Install the specified repository as a package source.\nThe :id key must contain a recognised repository."}
                      {:ns pallet.actions,
                       :name check-remote-directory-arguments,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 238,
                       :var-type :fn,
                       :arglists ([m])}
                      {:ns pallet.actions,
                       :name package-manager,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 604,
                       :var-type :fn,
                       :arglists ([session
                                   action
                                   {:keys [packages scope],
                                    :as options}]
                                  [session action]),
                       :doc "Package manager controls.\n\n   `action` is one of the following:\n   - :update          - update the list of available packages\n   - :list-installed  - output a list of the installed packages\n   - :add-scope       - enable a scope (eg. multiverse, non-free)\n\n   To refresh the list of packages known to the package manager:\n       (package-manager session :update)\n\n   To enable multiverse on ubuntu:\n       (package-manager session :add-scope :scope :multiverse)\n\n   To enable non-free on debian:\n       (package-manager session :add-scope :scope :non-free)"}
                      {:ns pallet.actions,
                       :name rsync-to-local,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 708,
                       :var-type :fn,
                       :arglists ([session
                                   remote-path
                                   local-path
                                   {:keys [port ip username],
                                    :as options}]),
                       :doc "Use rsync to copy files from remote-path to local-path"}
                      {:ns pallet.actions,
                       :name exec,
                       :dont-test "Alias of pallet.actions.decl/exec",
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 16,
                       :var-type :fn,
                       :arglists [[session
                                   {:keys [language
                                           interpreter
                                           version],
                                    :or {language :bash}}
                                   script]],
                       :doc "Execute script on the target node. The `script` is a plain string. `type`\n   specifies the script language (default :bash). You can override the\n   interpreter path using the `:interpreter` option."}
                      {:ns pallet.actions,
                       :name log-script-output,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 898,
                       :macro true,
                       :var-type :macro,
                       :arglists ([script-return-value
                                   {:keys [out err exit fmt],
                                    :or {out :debug,
                                         err :info,
                                         exit :none,
                                         fmt "%s"}}]),
                       :doc "Log the result of a script action."}
                      {:ns pallet.actions,
                       :name directory,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 114,
                       :var-type :fn,
                       :arglists ([session
                                   dir-path
                                   {:keys [action
                                           recursive
                                           force
                                           path
                                           mode
                                           verbose
                                           owner
                                           group],
                                    :or {action :create,
                                         recursive true,
                                         force true,
                                         path true},
                                    :as options}]
                                  [session dir-path]),
                       :doc "Directory management.\n\n   For :create and :touch, all components of path are effected.\n\n   Options are:\n    - :action     One of :create, :touch, :delete\n    - :recursive  Flag for recursive delete\n    - :force      Flag for forced delete\n    - :path       flag to create all path elements\n    - :owner      set owner\n    - :group      set group\n    - :mode       set mode"}
                      {:ns pallet.actions,
                       :name remote-directory,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 427,
                       :var-type :fn,
                       :arglists ([session
                                   path
                                   {:keys [action
                                           url
                                           local-file
                                           remote-file
                                           unpack
                                           tar-options
                                           unzip-options
                                           jar-options
                                           strip-components
                                           md5
                                           md5-url
                                           owner
                                           group
                                           recursive
                                           force-overwrite
                                           local-file-options],
                                    :or {action :create,
                                         tar-options "xz",
                                         unzip-options "-o",
                                         jar-options "xf",
                                         strip-components 1,
                                         recursive true},
                                    :as options}]),
                       :doc "Specify the contents of remote directory.\n\nOptions:\n\n`:url`\n: a url to download content from\n\n`:unpack`\n: how download should be extracts (default :tar)\n\n`:tar-options`\n: options to pass to tar (default \"xz\")\n\n`:unzip-options`\n: options to pass to unzip (default \"-o\")\n\n`:jar-options`\n: options to pass to unzip (default \"xf\") jar does not support stripping path\n  components\n\n`:strip-components`\n: number of path components to remove when unpacking\n\n`:extract-files`\n: extract only the specified files or directories from the archive\n\n`:md5`\n: md5 of file to unpack\n\n`:md5-url`\n: url of md5 file for file to unpack\n\nOwnership options:\n`:owner`\n: owner of files\n\n`:group`\n: group of files\n\n`:recursive`\n: flag to recursively set owner and group\n\nTo install the content of an url pointing at a tar file, specify the :url\noption.\n\n    (remote-directory session path\n       :url \"http://a.com/path/file.tgz\")\n\nIf there is an md5 url with the tar file's md5, you can specify that as well,\nto prevent unnecessary downloads and verify the content.\n\n    (remote-directory session path\n       :url \"http://a.com/path/file.tgz\"\n       :md5-url \"http://a.com/path/file.md5\")\n\nTo install the content of an url pointing at a zip file, specify the :url\noption and :unpack :unzip.\n\n    (remote-directory session path\n       :url \"http://a.com/path/file.\"\n       :unpack :unzip)\n\nTo install the content of an url pointing at a jar/tar/zip file, extracting\nonly specified files or directories, use the :extract-files option.\n\n    (remote-directory session path\n       :url \"http://a.com/path/file.jar\"\n       :unpack :jar\n       :extract-files [\"dir/file\" \"file2\"])"}
                      {:ns pallet.actions,
                       :name exec-script*,
                       :dont-test "Alias of pallet.actions.decl/exec-script*",
                       :file "pallet/actions/decl.clj",
                       :defonce true,
                       :column 1,
                       :line 22,
                       :var-type :fn,
                       :arglists [[session script]],
                       :doc "Execute script on the target node. The script is a plain string."}
                      {:var-type :var,
                       :line 27,
                       :column 1,
                       :file "pallet/actions/decl.clj",
                       :name package-source-changed-flag,
                       :ns pallet.actions,
                       :dont-test "Alias of pallet.actions.decl/package-source-changed-flag"}
                      {:ns pallet.actions,
                       :name file,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 54,
                       :var-type :fn,
                       :arglists ([session
                                   path
                                   {:keys [action
                                           owner
                                           group
                                           mode
                                           force],
                                    :or {action :create, force true},
                                    :as options}]
                                  [session path]),
                       :doc "Touch or remove a file. Can also set owner and permissions.\n\n     - :action    one of :create, :delete, :touch\n     - :owner     user name or id for owner of file\n     - :group     user name or id for group of file\n     - :mode      file permissions\n     - :force     when deleting, try and force removal"}
                      {:ns pallet.actions,
                       :name version-options,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 164,
                       :var-type :var,
                       :doc "A vector of options for controlling versions. Can be used for option\n          forwarding when calling remote-file from other crates."}
                      {:ns pallet.actions,
                       :name symbolic-link,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 70,
                       :var-type :fn,
                       :arglists ([session
                                   from
                                   name
                                   {:keys [action
                                           owner
                                           group
                                           mode
                                           force
                                           no-deref],
                                    :or {action :create, force true},
                                    :as options}]
                                  [session from name]),
                       :doc "Symbolic link management.\n\n     - :action    one of :create, :delete\n     - :owner     user name or id for owner of symlink\n     - :group     user name or id for group of symlink\n     - :mode      symlink permissions\n     - :force     when deleting, try and force removal\n     - :no-deref  do not deref target if it is a symlink to a directory"}
                      {:ns pallet.actions,
                       :name package-source,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 626,
                       :var-type :fn,
                       :arglists ([session
                                   name
                                   {:keys [], :as options}]),
                       :doc "Control package sources.\n   Options are the package manager keywords, each specifying a map of\n   packager specific options.\n\n## `:aptitude`\n\n`:source-type source-string`\n: the source type (default \"deb\")\n\n`:url url-string`\n: the repository url\n\n`:scopes seq`\n: scopes to enable for repository\n\n`:release release-name`\n: override the release name\n\n`:key-url url-string`\n: url for key\n\n`:key-server hostname`\n: hostname to use as a keyserver\n\n`:key-id id`\n: id for key to look it up from keyserver\n\n## `:yum`\n\n`:name name`\n: repository name\n\n`:url url-string`\n: repository base url\n\n`:gpgkey url-string`\n: gpg key url for repository\n\n## Example\n\n    (package-source \"Partner\"\n      :aptitude {:url \"http://archive.canonical.com/\"\n                 :scopes [\"partner\"]})"}
                      {:ns pallet.actions,
                       :name add-rpm,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 674,
                       :var-type :fn,
                       :arglists ([session rpm-name {:as options}]),
                       :doc "Add an rpm.  Source options are as for remote file."}
                      {:ns pallet.actions,
                       :name remote-file-arguments,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 182,
                       :var-type :var}
                      {:ns pallet.actions,
                       :name remote-file,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 253,
                       :var-type :fn,
                       :arglists ([session
                                   path
                                   {:keys [action
                                           url
                                           local-file
                                           remote-file
                                           link
                                           content
                                           literal
                                           template
                                           values
                                           md5
                                           md5-url
                                           owner
                                           group
                                           mode
                                           force
                                           blob
                                           blobstore
                                           install-new-files
                                           overwrite-changes
                                           no-versioning
                                           max-versions
                                           flag-on-changed
                                           local-file-options
                                           verify],
                                    :as options}]),
                       :doc "Remote file content management.\n\nThe `remote-file` action can specify the content of a remote file in a number\ndifferent ways.\n\nBy default, the remote-file is versioned, and 5 versions are kept.\n\nThe remote content is also verified against its md5 hash.  If the contents\nof the remote file have changed (e.g. have been edited on the remote machine)\nthen by default the file will not be overwritten, and an error will be raised.\nTo force overwrite, call `set-force-overwrite` before running `converge` or\n`lift`.\n\nOptions for specifying the file's content are:\n`url`\n: download the specified url to the given filepath\n\n`content`\n: use the specified content directly\n\n`local-file`\n: use the file on the local machine at the given path\n\n`remote-file`\n: use the file on the remote machine at the given path\n\n`link`\n: file to link to\n\n`literal`\n: prevent shell expansion on content\n\n`md5`\n: md5 for file\n\n`md5-url`\n: a url containing file's md5\n\n`template`\n: specify a template to be interpolated\n\n`values`\n: values for interpolation\n\n`blob`\n: map of `container`, `path`\n\n`blobstore`\n: a jclouds blobstore object (override blobstore in session)\n\n`insecure`\n: boolean to specify ignoring of SLL certs\n\nOptions for version control are:\n\n`overwrite-changes`\n: flag to force overwriting of locally modified content\n\n`no-versioning`\n: do not version the file\n\n`max-versions`\n: specify the number of versions to keep (default 5)\n\n`flag-on-changed`\n: flag to set if file is changed\n\nOptions for specifying the file's permissions are:\n\n`owner`\n: user-name\n\n`group`\n: group-name\n\n`mode`\n: file-mode\n\nOptions for verifying the file's content:\n\n`verify`\n: a command to run on the file on the node, before it is installed\n\nTo copy the content of a local file to a remote file:\n    (remote-file session \"remote/path\" :local-file \"local/path\")\n\nTo copy the content of one remote file to another remote file:\n    (remote-file session \"remote/path\" :remote-file \"remote/source/path\")\n\nTo link one remote file to another remote file:\n    (remote-file session \"remote/path\" :link \"remote/source/path\")\n\nTo download a url to a remote file:\n    (remote-file session \"remote/path\" :url \"http://a.com/path\")\n\nIf a url to a md5 file is also available, then it can be specified to prevent\nunnecessary downloads and to verify the download.\n\n    (remote-file session \"remote/path\"\n      :url \"http://a.com/path\"\n      :md5-url \"http://a.com/path.md5\")\n\nIf the md5 of the file to download, it can be specified to prevent unnecessary\ndownloads and to verify the download.\n\n    (remote-file session \"remote/path\"\n      :url \"http://a.com/path\"\n      :md5 \"6de9439834c9147569741d3c9c9fc010\")\n\nContent can also be copied from a blobstore.\n\n    (remote-file session \"remote/path\"\n      :blob {:container \"container\" :path \"blob\"})"}
                      {:ns pallet.actions,
                       :name sed,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 101,
                       :var-type :fn,
                       :arglists ([session
                                   path
                                   exprs-map
                                   {:keys [separator
                                           no-md5
                                           restriction],
                                    :as options}]
                                  [session path exprs-map]),
                       :doc "Execute sed on the file at path.  Takes a map of expr to replacement.\n     - :separator     the separator to use in generated sed expressions. This\n                      will be inferred if not specified.\n     - :no-md5        prevent md5 generation for the modified file\n     - :restriction   restrict the sed expressions to a particular context."}
                      {:ns pallet.actions,
                       :name one-node-filter,
                       :file "pallet/actions.clj",
                       :column 1,
                       :internal true,
                       :line 876,
                       :var-type :fn,
                       :arglists ([role->nodes [role & roles]])}
                      {:ns pallet.actions,
                       :name rsync-directory,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 717,
                       :var-type :fn,
                       :arglists ([session
                                   from
                                   to
                                   &
                                   {:keys [owner group mode port],
                                    :as options}]),
                       :doc "Rsync from a local directory to a remote directory."}
                      {:ns pallet.actions,
                       :name remote-file-content,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 417,
                       :var-type :fn,
                       :arglists ([session path]),
                       :doc "Return a function that returns the content of a file, when used inside\n   another action."}
                      {:ns pallet.actions,
                       :name rsync,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 698,
                       :var-type :fn,
                       :arglists ([session
                                   local-path
                                   remote-path
                                   {:keys [port], :as options}]),
                       :doc "Use rsync to copy files from local-path to remote-path"}
                      {:ns pallet.actions,
                       :name service-script,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 831,
                       :var-type :fn,
                       :arglists ([session
                                   service-name
                                   &
                                   {:keys [action
                                           url
                                           local-file
                                           remote-file
                                           link
                                           content
                                           literal
                                           template
                                           values
                                           md5
                                           md5-url
                                           force
                                           service-impl],
                                    :or {action :create,
                                         service-impl :initd},
                                    :as options}]),
                       :doc "Install a service script.  Sources as for remote-file."}
                      {:ns pallet.actions,
                       :name directories,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 138,
                       :var-type :fn,
                       :arglists ([session paths options]),
                       :doc "Directory management of multiple directories with the same\n   owner/group/permissions.\n\n   `options` are as for `directory` and are applied to each directory in\n   `paths`"}
                      {:ns pallet.actions,
                       :name plan-flag-kw,
                       :file "pallet/actions.clj",
                       :column 1,
                       :internal true,
                       :line 48,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Generator for plan flag keywords"}
                      {:ns pallet.actions,
                       :name set-install-new-files,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 242,
                       :var-type :fn,
                       :arglists ([flag]),
                       :doc "Set boolean flag to control installation of new files"}
                      {:ns pallet.actions,
                       :name content-options,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 157,
                       :var-type :var,
                       :doc "A vector of the options accepted by remote-file.  Can be used for\n          option forwarding when calling remote-file from other crates."}
                      {:ns pallet.actions,
                       :name with-remote-file,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 405,
                       :var-type :fn,
                       :arglists ([session f path & args]),
                       :doc "Function to call f with a local copy of the sessioned remote path.\n   f should be a function taking [session local-path & _], where local-path will\n   be a File with a copy of the remote file (which will be unlinked after\n   calling f."}
                      {:ns pallet.actions,
                       :name exec-script,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 28,
                       :macro true,
                       :var-type :macro,
                       :arglists ([session & script]),
                       :doc "Execute a bash script remotely. The script is expressed in stevedore."}
                      {:ns pallet.actions,
                       :name all-options,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 176,
                       :var-type :var,
                       :doc "A vector of the options accepted by remote-file.  Can be used for\n          option forwarding when calling remote-file from other crates."}
                      {:var-type :fn,
                       :ns pallet.actions,
                       :name packages,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 559,
                       :arglists ([session
                                   package-names
                                   {:keys [yum aptitude pacman brew],
                                    :as options}]
                                  [session package-names]),
                       :doc "Install packages with common options.\n\n   Options\n    - :action [:install | :remove | :upgrade]\n    - :purge [true|false]         when removing, whether to remove all config\n    - :enable [repo|(seq repo)]   enable specific repository\n    - :disable [repo|(seq repo)]  disable specific repository\n    - :priority n                 priority (0-100, default 50)\n    - :disable-service-start      disable service startup (default false)\n    - :allow-unsigned             install package even if unsigned\n\n       (packages session [\"git\" \"git-email\"])\n       (packages session [\"git-core\" \"git-email\"] {:action :remove})\n\n## Function Signatures\n\n  - TargetSession [String] -> Any\n  - TargetSession [String] PackageOptions -> Any",
                       :sig [[{:target {Keyword Any},
                               :execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                 (optional-key
                                                  :recorder) pallet.core.recorder.protocols.Record,
                                                 (optional-key
                                                  :action-options) {Keyword Any},
                                                 (optional-key :user) Any,
                                                 (optional-key
                                                  :environment) Any,
                                                 (optional-key
                                                  :extension) {Keyword Any},
                                                 (optional-key
                                                  :record-all) {Keyword java.lang.Boolean},
                                                 (optional-key
                                                  :event-fn) Any},
                               (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                               :type (eq :pallet.session/session)}
                              [java.lang.String]
                              :-
                              Any]
                             [{:target {Keyword Any},
                               :execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                 (optional-key
                                                  :recorder) pallet.core.recorder.protocols.Record,
                                                 (optional-key
                                                  :action-options) {Keyword Any},
                                                 (optional-key :user) Any,
                                                 (optional-key
                                                  :environment) Any,
                                                 (optional-key
                                                  :extension) {Keyword Any},
                                                 (optional-key
                                                  :record-all) {Keyword java.lang.Boolean},
                                                 (optional-key
                                                  :event-fn) Any},
                               (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                               :type (eq :pallet.session/session)}
                              [java.lang.String]
                              {(optional-key :action) Keyword,
                               (optional-key :y) java.lang.Boolean,
                               (optional-key :force) java.lang.Boolean,
                               (optional-key :purge) java.lang.Boolean,
                               (optional-key :priority) Int,
                               (optional-key :enable) java.lang.Boolean,
                               (optional-key :disable) java.lang.Boolean,
                               (optional-key :allow-unsigned) java.lang.Boolean}
                              :-
                              Any]]}
                      {:ns pallet.actions,
                       :name install-deb,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 679,
                       :var-type :fn,
                       :arglists ([session deb-name {:as options}]),
                       :doc "Add a deb.  Source options are as for remote file."}
                      {:ns pallet.actions,
                       :name set-force-overwrite,
                       :file "pallet/actions.clj",
                       :column 1,
                       :line 247,
                       :var-type :fn,
                       :arglists ([flag]),
                       :doc "Globally force installation of new files, even if content on node has\n  changed."}),
               :ns-name pallet.actions,
               :doc "Pallet's action primitives."}
              {:vars ({:ns pallet.blobstore.implementation,
                       :name load-providers,
                       :file "pallet/blobstore/implementation.clj",
                       :column 1,
                       :line 23,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Require all providers, ensuring no errors if individual providers can not be\n   loaded"}
                      {:ns pallet.blobstore.implementation,
                       :name supported-providers,
                       :file "pallet/blobstore/implementation.clj",
                       :column 1,
                       :line 40,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Create a list of supported providers"}
                      {:ns pallet.blobstore.implementation,
                       :name exclude-regex,
                       :file "pallet/blobstore/implementation.clj",
                       :column 1,
                       :line 14,
                       :var-type :var}
                      {:ns pallet.blobstore.implementation,
                       :name provider-list,
                       :file "pallet/blobstore/implementation.clj",
                       :column 1,
                       :line 15,
                       :var-type :var}
                      {:ns pallet.blobstore.implementation,
                       :name blobstore-prefix,
                       :file "pallet/blobstore/implementation.clj",
                       :column 1,
                       :line 11,
                       :var-type :var}
                      {:private true,
                       :ns pallet.blobstore.implementation,
                       :name providers,
                       :file "pallet/blobstore/implementation.clj",
                       :column 1,
                       :line 17,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Find the available providers."}
                      {:var-type :multi-method,
                       :ns pallet.blobstore.implementation,
                       :name service,
                       :file "pallet/blobstore/implementation.clj",
                       :column 1,
                       :line 6,
                       :doc "Instantiate a blobstore. Providers should implement a method for this.\n   See pallet.blobstore/blobstore-service."}
                      {:ns pallet.blobstore.implementation,
                       :name exclude-blobstore-ns,
                       :file "pallet/blobstore/implementation.clj",
                       :column 1,
                       :line 12,
                       :var-type :var}),
               :ns-name pallet.blobstore.implementation,
               :doc "Implementation details"}
              {:vars ({:methods ({:var-type :protocol-method,
                                  :ns pallet.blobstore.protocols,
                                  :doc "Upload a file",
                                  :arglists ([blobstore
                                              container
                                              path
                                              file]),
                                  :name put-file}
                                 {:var-type :protocol-method,
                                  :ns pallet.blobstore.protocols,
                                  :doc "Create a signed request",
                                  :arglists ([blobstore
                                              container
                                              path
                                              request-map]),
                                  :name sign-blob-request}
                                 {:var-type :protocol-method,
                                  :ns pallet.blobstore.protocols,
                                  :doc "Close the blobstore",
                                  :arglists ([blobstore]),
                                  :name close}
                                 {:var-type :protocol-method,
                                  :ns pallet.blobstore.protocols,
                                  :doc "List containers",
                                  :arglists ([blobstore]),
                                  :name containers}
                                 {:var-type :protocol-method,
                                  :ns pallet.blobstore.protocols,
                                  :doc "Upload a file, string, input stream, etc",
                                  :arglists ([blobstore
                                              container
                                              path
                                              payload]),
                                  :name put}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.blobstore.protocols,
                       :name Blobstore,
                       :file "pallet/blobstore/protocols.clj",
                       :column 1,
                       :line 5}),
               :ns-name pallet.blobstore.protocols,
               :doc "Protocols for the blobstore"}
              {:vars ({:var-type :fn,
                       :ns pallet.blobstore.url-blobstore,
                       :name map->UrlBlobstore,
                       :file "pallet/blobstore/url_blobstore.clj",
                       :column 1,
                       :line 8,
                       :arglists ([m__5869__auto__]),
                       :doc "Factory function for class pallet.blobstore.url_blobstore.UrlBlobstore, taking a map of keywords to field values."}
                      {:var-type :fn,
                       :ns pallet.blobstore.url-blobstore,
                       :name ->UrlBlobstore,
                       :file "pallet/blobstore/url_blobstore.clj",
                       :column 1,
                       :line 8,
                       :arglists ([base-url]),
                       :doc "Positional factory function for class pallet.blobstore.url_blobstore.UrlBlobstore."}),
               :ns-name pallet.blobstore.url-blobstore,
               :doc "A url based blobstore implementation."}
              {:vars ({:ns pallet.blobstore,
                       :name put,
                       :file "pallet/blobstore.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([blobstore container path payload]),
                       :doc "Upload a file, string, input stream, etc"}
                      {:ns pallet.blobstore,
                       :name service,
                       :file "pallet/blobstore.clj",
                       :column 1,
                       :line 9,
                       :var-type :fn,
                       :arglists ([provider-name
                                   &
                                   {:keys [identity
                                           credential
                                           extensions],
                                    :as options}]),
                       :doc "Instantiate a blobstore service based on the given arguments"}
                      {:ns pallet.blobstore,
                       :name blobstore?,
                       :file "pallet/blobstore.clj",
                       :column 1,
                       :line 41,
                       :var-type :fn,
                       :arglists ([b]),
                       :doc "Predicate to test if argument is a blobstore."}
                      {:ns pallet.blobstore,
                       :name blobstore-from-config,
                       :file "pallet/blobstore.clj",
                       :column 1,
                       :line 52,
                       :var-type :fn,
                       :arglists ([& args__5240__auto__])}
                      {:ns pallet.blobstore,
                       :name containers,
                       :file "pallet/blobstore.clj",
                       :column 1,
                       :line 31,
                       :var-type :fn,
                       :arglists ([blobstore]),
                       :doc "List containers"}
                      {:ns pallet.blobstore,
                       :name close,
                       :file "pallet/blobstore.clj",
                       :column 1,
                       :line 36,
                       :var-type :fn,
                       :arglists ([blobstore]),
                       :doc "Close the blobstore"}
                      {:ns pallet.blobstore,
                       :name blobstore-from-map,
                       :file "pallet/blobstore.clj",
                       :column 1,
                       :line 51,
                       :var-type :fn,
                       :arglists ([& args__5240__auto__])}
                      {:ns pallet.blobstore,
                       :name sign-blob-request,
                       :file "pallet/blobstore.clj",
                       :column 1,
                       :line 16,
                       :var-type :fn,
                       :arglists ([blobstore
                                   container
                                   path
                                   request-map]),
                       :doc "Create a signed request"}
                      {:ns pallet.blobstore,
                       :name blobstore-from-config-file,
                       :file "pallet/blobstore.clj",
                       :column 1,
                       :line 53,
                       :var-type :fn,
                       :arglists ([& args__5240__auto__])}
                      {:ns pallet.blobstore,
                       :name put-file,
                       :file "pallet/blobstore.clj",
                       :column 1,
                       :line 26,
                       :var-type :fn,
                       :arglists ([blobstore container path file]),
                       :doc "Upload a file"}),
               :ns-name pallet.blobstore,
               :doc "Blobstore abstraction"}
              {:vars ({:ns pallet.compute.hybrid,
                       :name supported-providers,
                       :file "pallet/compute/hybrid.clj",
                       :column 1,
                       :line 15,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.compute.hybrid,
                       :name forward-op,
                       :file "pallet/compute/hybrid.clj",
                       :column 1,
                       :line 24,
                       :var-type :fn,
                       :arglists ([compute nodes ch f]),
                       :doc "Forward an async op to the nodes' compute-service."}
                      {:ns pallet.compute.hybrid,
                       :name group-dispatcher,
                       :file "pallet/compute/hybrid.clj",
                       :column 1,
                       :line 120,
                       :var-type :fn,
                       :arglists ([groups-for-services]),
                       :doc "Return a dispatch function based on a map from service to groups."}
                      {:private true,
                       :ns pallet.compute.hybrid,
                       :name services,
                       :file "pallet/compute/hybrid.clj",
                       :column 1,
                       :line 18,
                       :var-type :fn,
                       :arglists ([service-map]),
                       :doc "Return the service objects from the service map"}
                      {:ns pallet.compute.hybrid,
                       :name ensure-service-dispatch,
                       :file "pallet/compute/hybrid.clj",
                       :column 1,
                       :line 110,
                       :var-type :fn,
                       :arglists ([f])}
                      {:var-type :fn,
                       :ns pallet.compute.hybrid,
                       :name ->HybridService,
                       :file "pallet/compute/hybrid.clj",
                       :column 1,
                       :line 40,
                       :arglists ([service-map dispatch environment]),
                       :doc "Positional factory function for class pallet.compute.hybrid.HybridService."}),
               :ns-name pallet.compute.hybrid,
               :doc "Hybrid provider service implementation."}
              {:vars ({:ns pallet.compute.implementation,
                       :name load-providers,
                       :file "pallet/compute/implementation.clj",
                       :column 1,
                       :line 32,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Require all providers, ensuring no errors if individual providers can not be\n   loaded"}
                      {:ns pallet.compute.implementation,
                       :name supported-providers,
                       :file "pallet/compute/implementation.clj",
                       :column 1,
                       :line 60,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Create a list of supported providers"}
                      {:ns pallet.compute.implementation,
                       :name exclude-regex,
                       :file "pallet/compute/implementation.clj",
                       :column 1,
                       :line 21,
                       :var-type :var}
                      {:ns pallet.compute.implementation,
                       :name provider-list,
                       :file "pallet/compute/implementation.clj",
                       :column 1,
                       :line 23,
                       :var-type :var}
                      {:private true,
                       :ns pallet.compute.implementation,
                       :name resolve-supported-providers,
                       :file "pallet/compute/implementation.clj",
                       :column 1,
                       :line 55,
                       :var-type :fn,
                       :arglists ([ns-sym]),
                       :doc "Function to provide a type to the result of ns-resolve."}
                      {:ns pallet.compute.implementation,
                       :name exclude-compute-ns,
                       :file "pallet/compute/implementation.clj",
                       :column 1,
                       :line 16,
                       :var-type :var}
                      {:private true,
                       :ns pallet.compute.implementation,
                       :name providers,
                       :file "pallet/compute/implementation.clj",
                       :column 1,
                       :line 25,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Find the available providers."}
                      {:var-type :multi-method,
                       :ns pallet.compute.implementation,
                       :name service,
                       :file "pallet/compute/implementation.clj",
                       :column 1,
                       :line 8,
                       :doc "Instantiate a compute service. Providers should implement a method for this.\n   See pallet.compute/instantiate-provider."}
                      {:ns pallet.compute.implementation,
                       :name compute-prefix,
                       :file "pallet/compute/implementation.clj",
                       :column 1,
                       :line 14,
                       :var-type :var}),
               :ns-name pallet.compute.implementation,
               :doc "Implementation details"}
              {:vars ({:ns pallet.compute.jvm,
                       :name jvm-os-map,
                       :file "pallet/compute/jvm.clj",
                       :column 1,
                       :line 3,
                       :var-type :var}
                      {:ns pallet.compute.jvm,
                       :name os-family,
                       :file "pallet/compute/jvm.clj",
                       :column 1,
                       :line 9,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.compute.jvm,
                       :name slf4j?,
                       :file "pallet/compute/jvm.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Predicate to test for slf4j on the classpath."}
                      {:ns pallet.compute.jvm,
                       :name log4j?,
                       :file "pallet/compute/jvm.clj",
                       :column 1,
                       :line 12,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Predicate to test for log4j on the classpath."}
                      {:ns pallet.compute.jvm,
                       :name os-name,
                       :file "pallet/compute/jvm.clj",
                       :column 1,
                       :line 6,
                       :var-type :fn,
                       :arglists ([])}),
               :ns-name pallet.compute.jvm,
               :doc "Information from local jvm"}
              {:vars ({:no-doc true,
                       :ns pallet.compute.localhost,
                       :name supported-providers,
                       :file "pallet/compute/localhost.clj",
                       :column 1,
                       :line 73,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Returns a sequence of providers that are supported"}
                      {:var-type :fn,
                       :ns pallet.compute.localhost,
                       :name ->LocalhostService,
                       :file "pallet/compute/localhost.clj",
                       :column 1,
                       :line 36,
                       :arglists ([node environment tag-provider]),
                       :doc "Positional factory function for class pallet.compute.localhost.LocalhostService."}
                      {:var-type :fn,
                       :ns pallet.compute.localhost,
                       :name ->NodeTagEphemeral,
                       :file "pallet/compute/localhost.clj",
                       :column 1,
                       :line 23,
                       :arglists ([tags]),
                       :doc "Positional factory function for class pallet.compute.localhost.NodeTagEphemeral."}),
               :ns-name pallet.compute.localhost,
               :doc "Localhost provider service implementation.\n\nThis enables your localhost to masquerade as a node for any group.\n\n`run-nodes` will set the group-name for the localhost node, but is otherwise a\nno-op.  The localhost node is marked as bootstrapped to prevent bootstrap\nactions from occurring on group-name changes.\n\nNode removal functions are no-ops."}
              {:vars ({:added "0.9.0",
                       :ns pallet.compute.node-list,
                       :name node-list,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :sig [[{(optional-key :node-list) [{(optional-key
                                                            :compute-service) pallet.compute.protocols.ComputeService,
                                                           (optional-key
                                                            :user) (both
                                                                    (pred
                                                                     has-credentials?)
                                                                    {(optional-key
                                                                      :public-key) (either
                                                                                    java.lang.String
                                                                                    bytes),
                                                                     (optional-key
                                                                      :sudo-password) java.lang.String,
                                                                     (optional-key
                                                                      :private-key-path) java.lang.String,
                                                                     (optional-key
                                                                      :password) java.lang.String,
                                                                     :username java.lang.String,
                                                                     (optional-key
                                                                      :temp-key) java.lang.Boolean,
                                                                     (optional-key
                                                                      :public-key-path) java.lang.String,
                                                                     (optional-key
                                                                      :passphrase) (either
                                                                                    java.lang.String
                                                                                    bytes),
                                                                     (optional-key
                                                                      :no-sudo) java.lang.Boolean,
                                                                     (optional-key
                                                                      :private-key) (either
                                                                                     java.lang.String
                                                                                     bytes),
                                                                     (optional-key
                                                                      :sudo-user) java.lang.String}),
                                                           :os-family Keyword,
                                                           :packager Keyword,
                                                           (optional-key
                                                            :run-state) (enum
                                                                         :suspended
                                                                         :running
                                                                         :stopped
                                                                         :terminated),
                                                           (optional-key
                                                            :os-version) java.lang.String,
                                                           (optional-key
                                                            :hardware) {Keyword Any},
                                                           (optional-key
                                                            :ssh-port) Int,
                                                           (optional-key
                                                            :image-user) {(optional-key
                                                                           :public-key) (either
                                                                                         java.lang.String
                                                                                         bytes),
                                                                          (optional-key
                                                                           :sudo-password) java.lang.String,
                                                                          (optional-key
                                                                           :private-key-path) java.lang.String,
                                                                          (optional-key
                                                                           :password) java.lang.String,
                                                                          :username java.lang.String,
                                                                          (optional-key
                                                                           :temp-key) java.lang.Boolean,
                                                                          (optional-key
                                                                           :public-key-path) java.lang.String,
                                                                          (optional-key
                                                                           :passphrase) (either
                                                                                         java.lang.String
                                                                                         bytes),
                                                                          (optional-key
                                                                           :no-sudo) java.lang.Boolean,
                                                                          (optional-key
                                                                           :private-key) (either
                                                                                          java.lang.String
                                                                                          bytes),
                                                                          (optional-key
                                                                           :sudo-user) java.lang.String},
                                                           (optional-key
                                                            :private-ip) (maybe
                                                                          java.lang.String),
                                                           (optional-key
                                                            :primary-ip) (maybe
                                                                          java.lang.String),
                                                           (optional-key
                                                            :is-64bit) java.lang.Boolean,
                                                           :id java.lang.String,
                                                           (optional-key
                                                            :provider-data) {Keyword Any},
                                                           (optional-key
                                                            :arch) java.lang.String,
                                                           (optional-key
                                                            :hostname) java.lang.String,
                                                           (optional-key
                                                            :proxy) {:port Int}}],
                               (optional-key :node-file) java.lang.String,
                               (optional-key :environment) {Keyword Any},
                               (optional-key :tag-provider) pallet.compute.protocols.NodeTagWriter}
                              :-
                              pallet.compute.protocols.ComputeService]],
                       :line 206,
                       :var-type :fn,
                       :arglists ([{:keys [node-list
                                           node-file
                                           environment
                                           tag-provider],
                                    :as options}]),
                       :doc "Create a node-list compute service, based on a sequence of\n  node maps.\n\n  If no `:node-list` is not passed, this will look for a file\n  describing the nodes.  Default locations are ${PALLET_HOSTS},\n  ./.pallet-nodes.edn, ~/.pallet/nodes.edn and /etc/pallet/nodes.edn,\n  in that order of priority.\n\n  A node descriptor in the nodes config file is a node-map.\n\n  The node file is either a vector of node maps, or a map from\n  group name to vector of node maps.\n\n  Optionally, an environment map can be passed using the :environment\n  keyword.  See `pallet.environment`.\n\n## Function Signatures\n\n  - {(optional-key :node-list) [node/Node], (optional-key :node-file) String, (optional-key :environment) {Keyword Any}, (optional-key :tag-provider) pallet.compute.protocols.NodeTagWriter} -> pallet.compute.protocols.ComputeService"}
                      {:ns pallet.compute.node-list,
                       :name read-node-file,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 178,
                       :var-type :fn,
                       :arglists ([file]),
                       :doc "Read the contents of node file if it exists."}
                      {:private true,
                       :ns pallet.compute.node-list,
                       :name node-file-data->node-list,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 145,
                       :var-type :fn,
                       :arglists ([data file])}
                      {:var-type :fn,
                       :ns pallet.compute.node-list,
                       :name ->NodeList,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 81,
                       :arglists ([node-list environment tag-provider]),
                       :doc "Positional factory function for class pallet.compute.node_list.NodeList."}
                      {:ns pallet.compute.node-list,
                       :name available-node-file,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 130,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Return the first available node-file as specified by PALLET_HOSTS,\n  or possible-node-files."}
                      {:ns pallet.compute.node-list,
                       :name node-data->node,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 119,
                       :var-type :fn,
                       :arglists ([node-data] [node-data group-name]),
                       :doc "Convert an external node data specification to a node."}
                      {:ns pallet.compute.node-list,
                       :name ip-for-name,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 43,
                       :var-type :fn,
                       :arglists ([n]),
                       :doc "Resolve the given hostname to an ip address."}
                      {:private true,
                       :ns pallet.compute.node-list,
                       :name ip-resolve-failed-msg,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 40,
                       :var-type :var}
                      {:ns pallet.compute.node-list,
                       :name possible-node-files,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 125,
                       :var-type :var}
                      {:var-type :fn,
                       :ns pallet.compute.node-list,
                       :name ->NodeTagStatic,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 56,
                       :arglists ([static-tags]),
                       :doc "Positional factory function for class pallet.compute.node_list.NodeTagStatic."}
                      {:no-doc true,
                       :ns pallet.compute.node-list,
                       :name supported-providers,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 186,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Returns a sequence of providers that are supported"}
                      {:private true,
                       :ns pallet.compute.node-list,
                       :name read-file,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 139,
                       :var-type :fn,
                       :arglists ([file]),
                       :doc "Read the contents of node file if it exists."}
                      {:private true,
                       :ns pallet.compute.node-list,
                       :name unsupported-exception,
                       :file "pallet/compute/node_list.clj",
                       :column 1,
                       :line 76,
                       :var-type :fn,
                       :arglists ([operation])}),
               :ns-name pallet.compute.node-list,
               :doc "A simple node list provider.\n\n   The node-list provider enables pallet to work with a server rack or existing\n   virtual machines. It works by maintaining a list of nodes. Each node\n   minimally provides an IP address, a host name, a group name and an operating\n   system. Nodes are constructed using `make-node`.\n\n   An instance of the node-list provider can be built using\n   `node-list`.\n\n       (node-list\n         {:node-list\n          [{:id \"host1\" :public-ip \"192.168.1.101\"\n            :os-family :ubuntu :packager :apt}\n           {:id \"host2\" :public-ip \"192.168.1.102\"\n            :os-family :ubuntu :packager :apt}]})"}
              {:vars ({:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Tag the `nodes` in `compute-service` with the `tags`.  Any\n   problems will be written to the channel, ch.",
                                  :arglists ([compute nodes tags ch]),
                                  :name tag-nodes}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.compute.protocols,
                       :name ComputeServiceTags,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 39}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Return the tags on the node.",
                                  :arglists ([compute node]),
                                  :name node-tags}
                                 {:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Return the specified tag on the node.",
                                  :arglists ([compute node tag-name]
                                             [compute
                                              node
                                              tag-name
                                              default-value]),
                                  :name node-tag}),
                       :var-type :protocol,
                       :doc "Provides a SPI for tagging nodes with values.",
                       :ns pallet.compute.protocols,
                       :name NodeTagReader,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 55}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Restart stopped or suspended nodes.",
                                  :arglists ([compute nodes ch]),
                                  :name resume-nodes}
                                 {:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Suspend nodes node.",
                                  :arglists ([compute nodes ch]),
                                  :name suspend-nodes}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.compute.protocols,
                       :name ComputeServiceNodeSuspend,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 35}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "List nodes. A sequence of node instances will be put onto the\n   channel, ch.",
                                  :arglists ([compute ch]),
                                  :name nodes}),
                       :var-type :protocol,
                       :doc "Basic asynchronous compute service.",
                       :ns pallet.compute.protocols,
                       :name ComputeService,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 8}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Predicate to test if the node-name has the given base-name.",
                                  :arglists ([compute
                                              node-name
                                              base-name]),
                                  :name matches-base-name?}),
                       :var-type :protocol,
                       :doc "Nodes names are made unique by the compute service, given a base name.",
                       :ns pallet.compute.protocols,
                       :name ComputeServiceNodeBaseName,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 50}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Stop nodes.",
                                  :arglists ([compute nodes ch]),
                                  :name stop-nodes}
                                 {:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Restart stopped or suspended nodes.",
                                  :arglists ([compute nodes ch]),
                                  :name restart-nodes}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.compute.protocols,
                       :name ComputeServiceNodeStop,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 31}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc nil,
                                  :arglists ([compute]),
                                  :name jump-hosts}),
                       :var-type :protocol,
                       :doc "Provide a SPI for specifying jump-hosts",
                       :ns pallet.compute.protocols,
                       :name JumpHosts,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 74}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Predicate for a node having the specified base name.",
                                  :arglists ([node base-name]),
                                  :name has-base-name?}),
                       :var-type :protocol,
                       :doc "Nodes names are made unique by the compute service, given a base name.",
                       :ns pallet.compute.protocols,
                       :name NodeBaseName,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 69}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Predicate to test the availability of tags on a node.",
                                  :arglists ([compute node]),
                                  :name node-taggable?}
                                 {:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Set a value on the given tag-name on the node.",
                                  :arglists ([compute
                                              node
                                              tag-name
                                              value]),
                                  :name tag-node!}),
                       :var-type :protocol,
                       :doc "Provides a SPI for adding tags to nodes.",
                       :ns pallet.compute.protocols,
                       :name NodeTagWriter,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 62}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Start `node-count` nodes using `node-spec`.  Node instances will\n   be put onto the channel, ch.  The channel will be closed when the\n   command completes.  Not all the requested nodes will necessarily\n   start succesfully.  The options map specifies values that may not\n   be supported on all providers, including `:node-name`, for\n   specifying the node name.",
                                  :arglists ([compute
                                              node-spec
                                              user
                                              node-count
                                              options
                                              ch]),
                                  :name create-nodes}
                                 {:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Writes a sequence of images to the channel, ch.",
                                  :arglists ([compute ch]),
                                  :name images}
                                 {:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Remove nodes. Any problems will be written to the channel, ch.",
                                  :arglists ([compute nodes ch]),
                                  :name destroy-nodes}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.compute.protocols,
                       :name ComputeServiceNodeCreateDestroy,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 15}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.compute.protocols,
                                  :doc "Return a map of service details.  Contains a :provider key at a minimum.\n    May contain current credentials.",
                                  :arglists ([compute]),
                                  :name service-properties}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.compute.protocols,
                       :name ComputeServiceProperties,
                       :file "pallet/compute/protocols.clj",
                       :column 1,
                       :line 45}),
               :ns-name pallet.compute.protocols,
               :doc "Protocols for the compute service"}
              {:vars ({:ns pallet.compute,
                       :name compute-service?,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 129,
                       :var-type :fn,
                       :arglists ([c]),
                       :doc "Predicate for the argument satisfying the ComputeService protocol."}
                      {:private true,
                       :ns pallet.compute,
                       :name node-spec-keys,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 242,
                       :var-type :var,
                       :doc "Vector of keywords recognised by node-spec"}
                      {:ns pallet.compute,
                       :name create-nodes,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 151,
                       :var-type :fn,
                       :arglists ([compute
                                   {:keys [image], :as node-spec}
                                   user
                                   node-count
                                   options
                                   ch]),
                       :doc "Create nodes running in the compute service."}
                      {:ns pallet.compute,
                       :name resume-nodes,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 200,
                       :var-type :fn,
                       :arglists ([compute nodes ch]),
                       :doc "Resume the nodes running in the compute service."}
                      {:ns pallet.compute,
                       :name instantiate-provider,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 93,
                       :var-type :fn,
                       :arglists ([provider-name
                                   {:keys [identity
                                           credential
                                           extensions
                                           node-list
                                           endpoint
                                           environment
                                           sub-services],
                                    :as options}]),
                       :doc "Instantiate a compute service. The provider name should be a recognised\njclouds provider, \"node-list\", \"hybrid\", or \"localhost\". The other\narguments are keyword value pairs.\n\n   - :identity     username or key\n   - :credential   password or secret\n   - :extensions   extension modules for jclouds\n   - :node-list    a list of nodes for the \"node-list\" provider.\n   - :environment  an environment map with service specific values.\n\nProvider specific options may also be passed."}
                      {:ns pallet.compute,
                       :name matches-selectors?,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 282,
                       :var-type :fn,
                       :arglists ([selectors node-spec-meta]),
                       :doc "Predicate for matching any of a set of keyword selectors with a\n  node-spec meta map."}
                      {:ns pallet.compute,
                       :name stop-nodes,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 188,
                       :var-type :fn,
                       :arglists ([compute nodes ch]),
                       :doc "Stop the nodes running in the compute service."}
                      {:ns pallet.compute,
                       :name ImageSpec,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 17,
                       :var-type :var}
                      {:ns pallet.compute,
                       :name tag-nodes,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 206,
                       :var-type :fn,
                       :arglists ([compute nodes tags]
                                  [compute nodes tags ch]),
                       :doc "Set the `tags` on all `nodes`."}
                      {:ns pallet.compute,
                       :name NodeSpecMeta,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 75,
                       :var-type :var}
                      {:ns pallet.compute,
                       :name suspend-nodes,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 194,
                       :var-type :fn,
                       :arglists ([compute nodes ch]),
                       :doc "Suspend the nodes running in the compute service."}
                      {:private true,
                       :ns pallet.compute,
                       :name require-protocol,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 140,
                       :var-type :fn,
                       :arglists ([protocol service operation])}
                      {:ns pallet.compute,
                       :name images,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 176,
                       :var-type :fn,
                       :arglists ([compute ch]),
                       :doc "Return the images available in the compute service."}
                      {:ns pallet.compute,
                       :name restart-nodes,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 182,
                       :var-type :fn,
                       :arglists ([compute nodes ch]),
                       :doc "Start the nodes running in the compute service."}
                      {:ns pallet.compute,
                       :name service-properties,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 227,
                       :var-type :fn,
                       :arglists ([compute]),
                       :doc "Return a map of service details.  Contains a :provider key at a minimum.\n  May contain current credentials."}
                      {:ns pallet.compute,
                       :name ImageSearchSchema,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 23,
                       :var-type :var}
                      {:ns pallet.compute,
                       :name HardwareSpec,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 42,
                       :var-type :var}
                      {:ns pallet.compute,
                       :name jump-hosts,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 233,
                       :var-type :fn,
                       :arglists ([compute]),
                       :doc "Return a sequence of jump hosts for accessing nodes in a compute\n  service."}
                      {:ns pallet.compute,
                       :name close,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 221,
                       :var-type :fn,
                       :arglists ([compute]),
                       :doc "Close the compute service, releasing any acquired resources."}
                      {:ns pallet.compute,
                       :name destroy-nodes,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 167,
                       :var-type :fn,
                       :arglists ([compute nodes ch]),
                       :doc "Destroy the nodes running in the compute service. Writes arex-tuple\n  with a sequence of result maps, with the :return-value set\n  to :pallet.compute/target-remved if the node as been successfully\n  destroyed."}
                      {:ns pallet.compute,
                       :name InboundPortSpec,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 49,
                       :var-type :var}
                      {:ns pallet.compute,
                       :name QosSpec,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 61,
                       :var-type :var}
                      {:ns pallet.compute,
                       :name supported-providers,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 82,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Return a list of supported provider names.\nEach name is suitable to be passed to compute-service."}
                      {:ns pallet.compute,
                       :name node-spec,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 246,
                       :var-type :fn,
                       :arglists ([{:keys [image
                                           hardware
                                           location
                                           network
                                           qos],
                                    :as options}]),
                       :doc "Create a node-spec.\n\n   Defines the compute image and hardware selector template.\n\n   This is used to filter a cloud provider's image and hardware list to select\n   an image and hardware for nodes created for this node-spec.\n\n   :image     a map describing a predicate for matching an image:\n              os-family os-name-matches os-version-matches\n              os-description-matches os-64-bit\n              image-version-matches image-name-matches\n              image-description-matches image-id\n\n   :location  a map describing a predicate for matching location:\n              location-id\n   :hardware  a map describing a predicate for matching hardware:\n              min-cores min-ram smallest fastest biggest architecture\n              hardware-id\n   :network   a map for network connectivity options:\n              inbound-ports\n   :qos       a map for quality of service options:\n              spot-price enable-monitoring"}
                      {:ns pallet.compute,
                       :name NetworkSpec,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 57,
                       :var-type :var}
                      {:private true,
                       :ns pallet.compute,
                       :name missing-provider-re,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 89,
                       :var-type :var}
                      {:ns pallet.compute,
                       :name nodes,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 144,
                       :var-type :fn,
                       :arglists ([compute ch]),
                       :doc "Return the nodes in the compute service.  Returns a rex-map with\n  a :targets key."}
                      {:var-type :fn,
                       :ns pallet.compute,
                       :name matches-base-name?,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 215,
                       :arglists ([compute node-name base-name]),
                       :doc "Resume the nodes running in the compute service."}
                      {:ns pallet.compute,
                       :name LocationSpec,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 38,
                       :var-type :var}
                      {:ns pallet.compute,
                       :name InboundPort,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 54,
                       :var-type :var}
                      {:ns pallet.compute,
                       :name NodeSpec,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 66,
                       :var-type :var}
                      {:private true,
                       :ns pallet.compute,
                       :name unsupported-exception,
                       :file "pallet/compute.clj",
                       :column 1,
                       :line 135,
                       :var-type :fn,
                       :arglists ([service operation])}),
               :ns-name pallet.compute,
               :doc "Abstraction of the compute interface"}
              {:vars ({:ns pallet.config-file.format,
                       :name name-values,
                       :file "pallet/config_file/format.clj",
                       :column 1,
                       :line 6,
                       :var-type :fn,
                       :arglists ([m
                                   &
                                   {:keys [separator],
                                    :or {separator " "}}]),
                       :doc "A property file.\n   The properties are written \"key value\", one per line.\n     m                   a key-value map\n     :separator chars    separator to use between key and value\n                         (default is a single space)"}
                      {:ns pallet.config-file.format,
                       :name sectioned-properties,
                       :file "pallet/config_file/format.clj",
                       :column 1,
                       :line 18,
                       :var-type :fn,
                       :arglists ([m
                                   &
                                   {:keys [separator],
                                    :or {separator " = "}}]),
                       :doc "A sectioned property file.\n   This is modeled as a map of maps. The keys of the outer map are the section\n   names.  The inner maps are keyword value maps."}),
               :ns-name pallet.config-file.format,
               :doc "Some standard file formating."}
              {:vars ({:ns pallet.core.api-builder,
                       :name defn-sig,
                       :file "pallet/core/api_builder.clj",
                       :column 1,
                       :line 22,
                       :macro true,
                       :var-type :macro,
                       :arglists [[name
                                   doc-string?
                                   attr-map?
                                   [params*]
                                   prepost-map?
                                   body]
                                  [name
                                   doc-string?
                                   attr-map?
                                   ([params*] prepost-map? body)
                                   +
                                   attr-map?]]}
                      {:ns pallet.core.api-builder,
                       :name defn-api,
                       :file "pallet/core/api_builder.clj",
                       :column 1,
                       :line 14,
                       :macro true,
                       :var-type :macro,
                       :arglists [[name
                                   doc-string?
                                   attr-map?
                                   [params*]
                                   prepost-map?
                                   body]
                                  [name
                                   doc-string?
                                   attr-map?
                                   ([params*] prepost-map? body)
                                   +
                                   attr-map?]]}),
               :ns-name pallet.core.api-builder,
               :doc "Defn forms for api functions"}
              {:vars ({:protocol nil,
                       :ns com.palletops.log-config.timbre,
                       :name context,
                       :file "com/palletops/log_config/timbre.clj",
                       :column 1,
                       :line 53,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Return the current context."}
                      {:ns pallet.core.context,
                       :name with-request-context,
                       :file "pallet/core/context.clj",
                       :column 1,
                       :line 13,
                       :macro true,
                       :var-type :macro,
                       :arglists ([& body]),
                       :doc "Ensure that there is a request id in the context"}
                      {:ns com.palletops.log-config.timbre,
                       :name with-context,
                       :file "com/palletops/log_config/timbre.clj",
                       :column 1,
                       :line 64,
                       :macro true,
                       :var-type :macro,
                       :arglists ([context & body]),
                       :doc "Execute body with the given context merged onto the current context."}
                      {:ns com.palletops.log-config.timbre,
                       :name with-domain,
                       :file "com/palletops/log_config/timbre.clj",
                       :column 1,
                       :line 122,
                       :macro true,
                       :var-type :macro,
                       :arglists ([domain & body]),
                       :doc "Set the domain for any log messages in body."}
                      {:ns com.palletops.log-config.timbre,
                       :name with-context-update,
                       :file "com/palletops/log_config/timbre.clj",
                       :column 1,
                       :line 70,
                       :macro true,
                       :var-type :macro,
                       :arglists ([[path f & args] & body]),
                       :doc "Execute body with the given context merged onto the current context."}),
               :ns-name pallet.core.context,
               :doc "Pallet context functions"}
              {:vars ({:ns pallet.core.data-api,
                       :name session-data,
                       :file "pallet/core/data_api.clj",
                       :column 1,
                       :line 67,
                       :var-type :fn,
                       :arglists ([{:keys [results
                                           new-nodes
                                           old-nodes],
                                    :as session}]),
                       :doc "Given a session data structure, returns a serializable data\n  structure with the results of the session"}
                      {:private true,
                       :ns pallet.core.data-api,
                       :name sorted-distinct,
                       :file "pallet/core/data_api.clj",
                       :column 1,
                       :line 40,
                       :var-type :fn,
                       :arglists ([coll]),
                       :doc "remove duplicates in the list preserving the order in which they first appeared"}
                      {:ns pallet.core.data-api,
                       :name run-summary,
                       :file "pallet/core/data_api.clj",
                       :column 1,
                       :line 55,
                       :var-type :fn,
                       :arglists ([r]),
                       :doc "returns a summary of a run of a phase on a group (from the :results\n  key in the session)"}
                      {:ns pallet.core.data-api,
                       :name explain-plan,
                       :file "pallet/core/data_api.clj",
                       :column 1,
                       :line 31,
                       :var-type :fn,
                       :arglists ([pfn
                                   node
                                   &
                                   {:keys [settings-phase]}])}
                      {:ns pallet.core.data-api,
                       :name service-map-from-compute,
                       :file "pallet/core/data_api.clj",
                       :column 1,
                       :line 9,
                       :var-type :fn,
                       :arglists ([compute])}
                      {:private true,
                       :ns pallet.core.data-api,
                       :name mock-exec-plan,
                       :file "pallet/core/data_api.clj",
                       :column 1,
                       :line 12,
                       :var-type :fn,
                       :arglists ([executor
                                   pfn
                                   node
                                   &
                                   {:keys [settings-phase]}]),
                       :doc "Creates mock provider with a mock node, and a mock group, and then lifts\n the plan function `pfn` on such group. "}
                      {:ns pallet.core.data-api,
                       :name groups,
                       :file "pallet/core/data_api.clj",
                       :column 1,
                       :line 50,
                       :var-type :fn,
                       :arglists ([session-data]),
                       :doc "For a session-data structure, it generates the list of groups affected"}
                      {:ns pallet.core.data-api,
                       :name phase-seq,
                       :file "pallet/core/data_api.clj",
                       :column 1,
                       :line 45,
                       :var-type :fn,
                       :arglists ([session-data]),
                       :doc "Returns a sequence of the phases as they were invoked."}),
               :ns-name pallet.core.data-api}
              {:vars ({:var-type :fn,
                       :ns pallet.core.executor.echo,
                       :name ->EchoActionExecutor,
                       :file "pallet/core/executor/echo.clj",
                       :column 1,
                       :line 8,
                       :arglists ([result-chan]),
                       :doc "Positional factory function for class pallet.core.executor.echo.EchoActionExecutor."}
                      {:ns pallet.core.executor.echo,
                       :name echo-executor,
                       :file "pallet/core/executor/echo.clj",
                       :column 1,
                       :line 17,
                       :var-type :fn,
                       :arglists ([])}),
               :ns-name pallet.core.executor.echo,
               :doc "An action executor over echo"}
              {:vars ({:ns pallet.core.executor.plan,
                       :name *plan-result-fns*,
                       :file "pallet/core/executor/plan.clj",
                       :column 1,
                       :dynamic true,
                       :line 16,
                       :var-type :var,
                       :doc "A map of plan result functions for action ids"}
                      {:ns pallet.core.executor.plan,
                       :name plan-executor,
                       :file "pallet/core/executor/plan.clj",
                       :column 1,
                       :line 58,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Return a plan executor"}
                      {:var-type :fn,
                       :ns pallet.core.executor.plan,
                       :name ->PlanActionExecutor,
                       :file "pallet/core/executor/plan.clj",
                       :column 1,
                       :line 44,
                       :arglists ([actions]),
                       :doc "Positional factory function for class pallet.core.executor.plan.PlanActionExecutor."}
                      {:ns pallet.core.executor.plan,
                       :name with-plan-result-fns,
                       :file "pallet/core/executor/plan.clj",
                       :column 1,
                       :line 20,
                       :macro true,
                       :var-type :macro,
                       :arglists ([m & body]),
                       :doc "Execute a block of code with prescribed plan result functions."}
                      {:ns pallet.core.executor.plan,
                       :name add-plan-result,
                       :file "pallet/core/executor/plan.clj",
                       :column 1,
                       :line 32,
                       :var-type :fn,
                       :arglists ([action])}
                      {:ns pallet.core.executor.plan,
                       :name plan-result-f,
                       :file "pallet/core/executor/plan.clj",
                       :column 1,
                       :line 26,
                       :var-type :fn,
                       :arglists ([action-id]),
                       :doc "Return a plan result function for an action id"}
                      {:ns pallet.core.executor.plan,
                       :name replace-action-with-symbol,
                       :file "pallet/core/executor/plan.clj",
                       :column 1,
                       :line 12,
                       :var-type :fn,
                       :arglists ([action])}
                      {:ns pallet.core.executor.plan,
                       :name plan,
                       :file "pallet/core/executor/plan.clj",
                       :column 1,
                       :line 63,
                       :var-type :fn,
                       :arglists ([executor])}
                      {:var-type :multi-method,
                       :ns pallet.core.executor.plan,
                       :name action-result,
                       :file "pallet/core/executor/plan.clj",
                       :column 1,
                       :line 6,
                       :doc "Compute the plan result for the plan action.  This is an extension\n  mechanism, which is useful in testing, for example."}),
               :ns-name pallet.core.executor.plan,
               :doc "An action executor that creates an action plan."}
              {:vars ({:ns pallet.core.executor.protocols,
                       :name executor?,
                       :file "pallet/core/executor/protocols.clj",
                       :column 1,
                       :line 10,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate to test for an executor"}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.core.executor.protocols,
                                  :doc "Execute an action on a target.",
                                  :arglists ([_ target action]),
                                  :name execute}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.core.executor.protocols,
                       :name ActionExecutor,
                       :file "pallet/core/executor/protocols.clj",
                       :column 1,
                       :line 6}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.core.executor.protocols,
                                  :doc "Return the node state for the given node.",
                                  :arglists ([executor node]),
                                  :name node-state}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.core.executor.protocols,
                       :name ActionExecutorState,
                       :file "pallet/core/executor/protocols.clj",
                       :column 1,
                       :line 15}),
               :ns-name pallet.core.executor.protocols,
               :doc "Action execution protocols"}
              {:vars ({:var-type :fn,
                       :ns pallet.core.executor.ssh,
                       :name ->SshActionExecutor,
                       :file "pallet/core/executor/ssh.clj",
                       :column 1,
                       :line 29,
                       :arglists ([transport state]),
                       :doc "Positional factory function for class pallet.core.executor.ssh.SshActionExecutor."}
                      {:ns pallet.core.executor.ssh,
                       :name ssh-executor,
                       :file "pallet/core/executor/ssh.clj",
                       :column 1,
                       :line 66,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.core.executor.ssh,
                       :name execute-ssh,
                       :file "pallet/core/executor/ssh.clj",
                       :column 1,
                       :line 18,
                       :var-type :fn,
                       :arglists ([transport node action value])}
                      {:ns pallet.core.executor.ssh,
                       :name execute-local,
                       :file "pallet/core/executor/ssh.clj",
                       :column 1,
                       :line 24,
                       :var-type :fn,
                       :arglists ([node action value])}),
               :ns-name pallet.core.executor.ssh,
               :doc "An action executor over ssh"}
              {:vars ({:ns pallet.core.executor,
                       :name node-state,
                       :file "pallet/core/executor.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([executor node])}
                      {:ns pallet.core.executor,
                       :name execute,
                       :file "pallet/core/executor.clj",
                       :column 1,
                       :line 6,
                       :var-type :fn,
                       :arglists ([executor target action]),
                       :doc "Execute an action on a target.\n\nThe executor can report an error by throwing an exception, in which\ncase no result value is available for the action, unless the thrown\nexception has a :result key in it's ex-data, in which case that is\nrecorded as the result, before re-throwing the exception."}
                      {:ns pallet.core.executor,
                       :name executor?,
                       :file "pallet/core/executor.clj",
                       :column 1,
                       :line 16,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate to test for an executor"}),
               :ns-name pallet.core.executor,
               :doc "Action Execution"}
              {:vars ({:methods ({:var-type :protocol-method,
                                  :ns pallet.core.file-upload.protocols,
                                  :doc "Return the path to which upload-file would upload a file for\n    target-path",
                                  :arglists ([_
                                              target-path
                                              action-options]),
                                  :name upload-file-path}
                                 {:var-type :protocol-method,
                                  :ns pallet.core.file-upload.protocols,
                                  :doc "Return the path to which intermediate files should be written for the\n    specified username.",
                                  :arglists ([_
                                              target-path
                                              action-options]),
                                  :name user-file-path}
                                 {:var-type :protocol-method,
                                  :ns pallet.core.file-upload.protocols,
                                  :doc "Upload a file to the target-path.\n\n    action-options must contain a :user, specifying the user to install\n    the file as.",
                                  :arglists ([_
                                              target
                                              local-path
                                              target-path
                                              action-options]),
                                  :name upload-file}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.core.file-upload.protocols,
                       :name FileUpload,
                       :file "pallet/core/file_upload/protocols.clj",
                       :column 1,
                       :line 4}),
               :ns-name pallet.core.file-upload.protocols,
               :doc "Protocols for file upload"}
              {:vars ({:var-type :fn,
                       :ns pallet.core.file-upload.rsync-upload,
                       :name ->RsyncUpload,
                       :file "pallet/core/file_upload/rsync_upload.clj",
                       :column 1,
                       :line 28,
                       :arglists ([upload-root]),
                       :doc "Positional factory function for class pallet.core.file_upload.rsync_upload.RsyncUpload."}
                      {:ns pallet.core.file-upload.rsync-upload,
                       :name rsync-upload,
                       :file "pallet/core/file_upload/rsync_upload.clj",
                       :column 1,
                       :line 48,
                       :var-type :fn,
                       :arglists ([{:keys [upload-root], :as options}]),
                       :doc "Create an instance of the rsync upload strategy."}
                      {:ns pallet.core.file-upload.rsync-upload,
                       :name rsync-upload-file,
                       :file "pallet/core/file_upload/rsync_upload.clj",
                       :column 1,
                       :line 15,
                       :var-type :fn,
                       :arglists ([local-path
                                   target-path
                                   address
                                   port
                                   username
                                   options])}
                      {:var-type :fn,
                       :ns pallet.core.file-upload.rsync-upload,
                       :name map->RsyncUpload,
                       :file "pallet/core/file_upload/rsync_upload.clj",
                       :column 1,
                       :line 28,
                       :arglists ([m__5869__auto__]),
                       :doc "Factory function for class pallet.core.file_upload.rsync_upload.RsyncUpload, taking a map of keywords to field values."}),
               :ns-name pallet.core.file-upload.rsync-upload,
               :doc "Implementation of file upload using rsync."}
              {:vars ({:ns pallet.core.file-upload,
                       :name upload-file-path,
                       :file "pallet/core/file_upload.clj",
                       :column 1,
                       :line 5,
                       :var-type :fn,
                       :arglists ([uploader
                                   target-path
                                   action-options]),
                       :doc "Return the path to which upload-file would upload a file for\n    target-path"}
                      {:ns pallet.core.file-upload,
                       :name user-file-path,
                       :file "pallet/core/file_upload.clj",
                       :column 1,
                       :line 11,
                       :var-type :fn,
                       :arglists ([uploader
                                   target-path
                                   action-options])}
                      {:ns pallet.core.file-upload,
                       :name upload-file,
                       :file "pallet/core/file_upload.clj",
                       :column 1,
                       :line 15,
                       :var-type :fn,
                       :arglists ([uploader
                                   target
                                   local-path
                                   target-path
                                   action-options]),
                       :doc "Upload a file to the target-path.\n\n   action-options must contain a :user, specifying the user to install\n   the file as."}
                      {:var-type :multi-method,
                       :ns pallet.core.file-upload,
                       :name file-uploader,
                       :file "pallet/core/file_upload.clj",
                       :column 1,
                       :line 23,
                       :doc "Instantiate a file-upload provider based on keyword and option map."}),
               :ns-name pallet.core.file-upload}
              {:vars ({:ns pallet.core.nodes,
                       :name localhost,
                       :file "pallet/core/nodes.clj",
                       :column 1,
                       :line 7,
                       :var-type :fn,
                       :arglists ([{:keys [name
                                           group-name
                                           ip
                                           os-family
                                           id],
                                    :or {name "localhost",
                                         group-name :local,
                                         ip "127.0.0.1",
                                         os-family (jvm/os-family),
                                         id "localhost"},
                                    :as options}]
                                  []),
                       :doc "Make a node representing the local host. This calls `make-node` with values\n   inferred for the local host. Takes options as for `make-node`.\n\n       :name \"localhost\"\n       :group-name \"local\"\n       :ip \"127.0.0.1\"\n       :os-family (pallet.compute.jvm/os-family)"}),
               :ns-name pallet.core.nodes,
               :doc "Functions for returning and filtering nodes"}
              {:vars ({:ns pallet.core.plan-state.in-memory,
                       :name in-memory-plan-state,
                       :file "pallet/core/plan_state/in_memory.clj",
                       :column 1,
                       :line 17,
                       :var-type :fn,
                       :arglists ([initial-state] []),
                       :doc "Return an in-memory plan-state."}
                      {:var-type :fn,
                       :ns pallet.core.plan-state.in-memory,
                       :name ->InMemoryPlanState,
                       :file "pallet/core/plan_state/in_memory.clj",
                       :column 1,
                       :line 7,
                       :arglists ([state]),
                       :doc "Positional factory function for class pallet.core.plan_state.in_memory.InMemoryPlanState."}),
               :ns-name pallet.core.plan-state.in-memory,
               :doc "An in-memory implementation of a plan state"}
              {:vars ({:ns pallet.core.plan-state.protocols,
                       :name plan-state?,
                       :file "pallet/core/plan_state/protocols.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate for a plan-state"}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.core.plan-state.protocols,
                                  :doc "Update the scope state using the function f, passing the current\n    state, and applying args.  Return value is undefined.",
                                  :arglists ([_
                                              scope-kw
                                              scope-val
                                              f
                                              args]),
                                  :name update-state}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.core.plan-state.protocols,
                       :name StateUpdate,
                       :file "pallet/core/plan_state/protocols.clj",
                       :column 1,
                       :line 16}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.core.plan-state.protocols,
                                  :doc "Get the state at `path` (a vector of keys), resolving for scope,\n    a map of scopes from scope keyword to scope value.  Return a\n    sequence of scope vector, value vector tuples. Return\n    `default-value` as value for all scopes requested that do not\n    provide a value for path.",
                                  :arglists ([_
                                              scope-map
                                              path
                                              default-value]),
                                  :name get-state}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.core.plan-state.protocols,
                       :name StateGet,
                       :file "pallet/core/plan_state/protocols.clj",
                       :column 1,
                       :line 7}),
               :ns-name pallet.core.plan-state.protocols,
               :doc "Protocols for the plan-state service.\n\nA scope is a host, facility, instance-id, provider, group, world, etc."}
              {:vars ({:ns pallet.core.plan-state,
                       :name scope-hierarchy,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 18,
                       :var-type :var}
                      {:ns pallet.core.plan-state,
                       :name merge-scopes-with,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 91,
                       :var-type :fn,
                       :arglists ([f scope-map]),
                       :doc "Given a scope map, merge the values from least specific to most specific"}
                      {:ns pallet.core.plan-state,
                       :name assoc-settings,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 111,
                       :var-type :fn,
                       :arglists ([plan-state
                                   node-id
                                   facility
                                   kw-values
                                   {:keys [instance-id]}]),
                       :doc "Set the settings for the specified host facility. The instance-id allows\n   the specification of specific instance of the facility (the default is\n   :default)."}
                      {:ns pallet.core.plan-state,
                       :name get-scopes,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 40,
                       :var-type :fn,
                       :arglists ([plan-state scopes path]
                                  [plan-state scopes path default]),
                       :doc "Given a sequence of scopes, return a sequence of scope, value\n  tuples for path.  Scopes which do not provide a value of path will\n  not present in the result map."}
                      {:ns pallet.core.plan-state,
                       :name merge-scopes,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 80,
                       :var-type :fn,
                       :arglists ([scope-map]),
                       :doc "Given a scope map, merge the values from least specific to most specific"}
                      {:ns pallet.core.plan-state,
                       :name get-settings,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 103,
                       :var-type :fn,
                       :arglists ([plan-state
                                   node-id
                                   facility
                                   {:keys [instance-id default]}]),
                       :doc "Retrieve the settings for the specified host facility. The instance-id allows\n   the specification of specific instance of the facility. If passed a nil\n   `instance-id`, then `:default` is used"}
                      {:ns pallet.core.plan-state,
                       :name sort-scopes,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 73,
                       :var-type :fn,
                       :arglists ([scope-tuples])}
                      {:ns pallet.core.plan-state,
                       :name plan-state?,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 34,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate for checking the type of a plan-state."}
                      {:ns pallet.core.plan-state,
                       :name update-scope,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 64,
                       :var-type :fn,
                       :arglists ([plan-state
                                   scope-kw
                                   scope-val
                                   f
                                   &
                                   args]),
                       :doc "Update the scope given by scope-kw and scope-val, using the\n  function f, passing the current state, and applying args.\n  Return value is undefined."}
                      {:ns pallet.core.plan-state,
                       :name get-scope,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 53,
                       :var-type :fn,
                       :arglists ([plan-state
                                   scope-kw
                                   scope-val
                                   path
                                   default]
                                  [plan-state scope-kw scope-val path]),
                       :doc "Given a single scope, return the value at path.\n  Return `default`, or nil if not specified, if the path is not specified\n  in scope."}
                      {:ns pallet.core.plan-state,
                       :name update-settings,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 120,
                       :var-type :fn,
                       :arglists ([plan-state
                                   node-id
                                   facility
                                   f
                                   args
                                   {:keys [instance-id]}]),
                       :doc "Update the settings for the specified host facility. The instance-id allows\n   the specification of specific instance of the facility (the default is\n   :default)."}
                      {:ns pallet.core.plan-state,
                       :name scope-comparator,
                       :file "pallet/core/plan_state.clj",
                       :column 1,
                       :line 30,
                       :var-type :var}),
               :ns-name pallet.core.plan-state,
               :doc "Functions to manipulate the plan-state map. The plan-state is for\nstorage of user data.  It used, for example, to represent all the\ncumulative settings information on the nodes in an operation.\n\nThe identifiers are globally unique, so a key can not exist in more\nthan one parent scope.  Therefore, given a host, and a group, the plan\nstate should look for info keyed by the host, then keyed by the group,\nand does not need to consider a host, group tuple.\n\n- host\n- group\n"}
              {:vars ({:methods ({:var-type :protocol-method,
                                  :ns pallet.core.protocols,
                                  :doc "Release acquired resources.",
                                  :arglists ([_]),
                                  :name close}),
                       :var-type :protocol,
                       :doc "Closeable protocol.",
                       :ns pallet.core.protocols,
                       :name Closeable,
                       :file "pallet/core/protocols.clj",
                       :column 1,
                       :line 4}),
               :ns-name pallet.core.protocols}
              {:vars ({:ns pallet.core.recorder.in-memory,
                       :name in-memory-recorder,
                       :file "pallet/core/recorder/in_memory.clj",
                       :column 1,
                       :line 12,
                       :var-type :fn,
                       :arglists ([])}
                      {:var-type :fn,
                       :ns pallet.core.recorder.in-memory,
                       :name ->InMemoryRecorder,
                       :file "pallet/core/recorder/in_memory.clj",
                       :column 1,
                       :line 5,
                       :arglists ([res]),
                       :doc "Positional factory function for class pallet.core.recorder.in_memory.InMemoryRecorder."}),
               :ns-name pallet.core.recorder.in-memory}
              {:vars ({:ns pallet.core.recorder.juxt,
                       :name juxt-recorder,
                       :file "pallet/core/recorder/juxt.clj",
                       :column 1,
                       :line 16,
                       :var-type :fn,
                       :arglists ([recorders])}
                      {:var-type :fn,
                       :ns pallet.core.recorder.juxt,
                       :name ->JuxtRecorder,
                       :file "pallet/core/recorder/juxt.clj",
                       :column 1,
                       :line 6,
                       :arglists ([recorders]),
                       :doc "Positional factory function for class pallet.core.recorder.juxt.JuxtRecorder."}),
               :ns-name pallet.core.recorder.juxt,
               :doc "A recorder that forwards to a sequence of other recorders."}
              {:vars ({:var-type :fn,
                       :ns pallet.core.recorder.null,
                       :name ->NullRecorder,
                       :file "pallet/core/recorder/null.clj",
                       :column 1,
                       :line 6,
                       :arglists ([]),
                       :doc "Positional factory function for class pallet.core.recorder.null.NullRecorder."}
                      {:ns pallet.core.recorder.null,
                       :name null-recorder,
                       :file "pallet/core/recorder/null.clj",
                       :column 1,
                       :line 12,
                       :var-type :fn,
                       :arglists ([])}),
               :ns-name pallet.core.recorder.null,
               :doc "Defines a result record that discards all results."}
              {:vars ({:ns pallet.core.recorder.protocols,
                       :name recorder?,
                       :file "pallet/core/recorder/protocols.clj",
                       :column 1,
                       :line 10,
                       :var-type :fn,
                       :arglists ([recorder]),
                       :doc "Predicate for checking the type of a plan-state."}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.core.recorder.protocols,
                                  :doc "Record a result",
                                  :arglists ([_ result]),
                                  :name record}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.core.recorder.protocols,
                       :name Record,
                       :file "pallet/core/recorder/protocols.clj",
                       :column 1,
                       :line 4}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.core.recorder.protocols,
                                  :doc "Return recorded results",
                                  :arglists ([_]),
                                  :name results}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.core.recorder.protocols,
                       :name Results,
                       :file "pallet/core/recorder/protocols.clj",
                       :column 1,
                       :line 7}),
               :ns-name pallet.core.recorder.protocols,
               :doc "Protocols for the action recorder"}
              {:vars ({:ns pallet.core.recorder,
                       :name record,
                       :file "pallet/core/recorder.clj",
                       :column 1,
                       :line 13,
                       :var-type :fn,
                       :arglists ([recorder result]),
                       :doc "Record a result.  Return value is unspecified."}
                      {:ns pallet.core.recorder,
                       :name recorder?,
                       :file "pallet/core/recorder.clj",
                       :column 1,
                       :line 7,
                       :var-type :fn,
                       :arglists ([recorder]),
                       :doc "Predicate for checking the type of a plan-state."}
                      {:ns pallet.core.recorder,
                       :name results,
                       :file "pallet/core/recorder.clj",
                       :column 1,
                       :line 18,
                       :var-type :fn,
                       :arglists ([recorder]),
                       :doc "Return all recorded results"}),
               :ns-name pallet.core.recorder,
               :doc "Record action results"}
              {:vars ({:ns pallet.core.script-builder,
                       :name build-script,
                       :file "pallet/core/script_builder.clj",
                       :column 1,
                       :line 63,
                       :var-type :fn,
                       :arglists ([{:keys [language
                                           version
                                           interpreter
                                           interpreter-args],
                                    :or {language :bash},
                                    :as options}
                                   script
                                   {:keys [script-dir
                                           script-trace
                                           script-hash],
                                    :or {script-hash true},
                                    :as action}]),
                       :doc "Builds a script. The script is wrapped in a shell script to set\nup the working directory (and possibly environment variables in the\nfuture)."}
                      {:var-type :multi-method,
                       :ns pallet.core.script-builder,
                       :name prefix,
                       :file "pallet/core/script_builder.clj",
                       :column 1,
                       :line 54,
                       :doc "The executable used to prefix the interpreter (eg. sudo, chroot, etc)."}
                      {:ns pallet.core.script-builder,
                       :name epilog,
                       :file "pallet/core/script_builder.clj",
                       :column 1,
                       :line 19,
                       :var-type :var}
                      {:ns pallet.core.script-builder,
                       :name build-code,
                       :file "pallet/core/script_builder.clj",
                       :column 1,
                       :line 104,
                       :var-type :fn,
                       :arglists ([user
                                   {:keys [default-script-prefix
                                           script-context
                                           script-dir
                                           script-env
                                           script-env-fwd
                                           script-prefix
                                           sudo-user],
                                    :as action}
                                   &
                                   args]),
                       :doc "Builds a code map, describing the command to execute a script."}
                      {:ns pallet.core.script-builder,
                       :name sudo-cmd-for,
                       :file "pallet/core/script_builder.clj",
                       :column 1,
                       :line 27,
                       :var-type :fn,
                       :arglists ([{:keys [no-sudo
                                           password
                                           sudo-user
                                           sudo-password
                                           username],
                                    :as user}]),
                       :doc "Construct a sudo command prefix for the specified user."}
                      {:var-type :multi-method,
                       :ns pallet.core.script-builder,
                       :name interpreter,
                       :file "pallet/core/script_builder.clj",
                       :column 1,
                       :line 21,
                       :doc "The interprester used to run a script."}
                      {:ns pallet.core.script-builder,
                       :name prolog,
                       :file "pallet/core/script_builder.clj",
                       :column 1,
                       :line 18,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.core.script-builder,
                       :name normalise-sudo-options,
                       :file "pallet/core/script_builder.clj",
                       :column 1,
                       :line 45,
                       :var-type :fn,
                       :arglists ([user action]),
                       :doc "Ensure that a :sudo-user specified in the action trumps a :no-sudo\n  specified in the admin user."}),
               :ns-name pallet.core.script-builder,
               :doc "Build scripts with prologues, epilogues, etc, and command lines for\n   running them in different environments"}
              {:vars ({:private true,
                       :ns pallet.core.script-state,
                       :name setvalue-regex,
                       :file "pallet/core/script_state.clj",
                       :column 1,
                       :line 16,
                       :var-type :var,
                       :doc "Regex used to match SETFLAG text in action output."}
                      {:ns pallet.core.script-state,
                       :name node-state,
                       :file "pallet/core/script_state.clj",
                       :column 1,
                       :line 64,
                       :var-type :fn,
                       :arglists ([state node-id]),
                       :doc "Return the node state."}
                      {:ns pallet.core.script-state,
                       :name parse-flags,
                       :file "pallet/core/script_state.clj",
                       :column 1,
                       :internal true,
                       :line 25,
                       :var-type :fn,
                       :arglists ([output]),
                       :doc "Parse flags from the output stream of an action.\n  Returns a map of state values."}
                      {:ns pallet.core.script-state,
                       :name merge-node-state,
                       :file "pallet/core/script_state.clj",
                       :column 1,
                       :internal true,
                       :line 20,
                       :var-type :fn,
                       :arglists ([state node-id new-flag-values]),
                       :doc "Set flag values for target."}
                      {:ns pallet.core.script-state,
                       :name parse-flag-values,
                       :file "pallet/core/script_state.clj",
                       :column 1,
                       :internal true,
                       :line 36,
                       :var-type :fn,
                       :arglists ([output]),
                       :doc "Parse flags with values from the output stream of an action.\n  Returns a map of state values."}
                      {:ns pallet.core.script-state,
                       :name get-node-state,
                       :file "pallet/core/script_state.clj",
                       :column 1,
                       :line 59,
                       :var-type :fn,
                       :arglists ([state node-id key]),
                       :doc "Return the node state value for key."}
                      {:ns pallet.core.script-state,
                       :name parse-node-state,
                       :file "pallet/core/script_state.clj",
                       :column 1,
                       :line 48,
                       :var-type :fn,
                       :arglists ([out]),
                       :doc "Parse any state flags out of the shell script output."}
                      {:private true,
                       :ns pallet.core.script-state,
                       :name setflag-regex,
                       :file "pallet/core/script_state.clj",
                       :column 1,
                       :line 12,
                       :var-type :var,
                       :doc "Regex used to match SETFLAG text in action output."}
                      {:ns pallet.core.script-state,
                       :name update-node-state,
                       :file "pallet/core/script_state.clj",
                       :column 1,
                       :line 54,
                       :var-type :fn,
                       :arglists ([state node-id out]),
                       :doc "Update the state map for node with flag values parsed from out."}),
               :ns-name pallet.core.script-state,
               :doc "## Script Flag and State Parsing\n\nIn order to capture node state, actions emit output that matches a specific\npattern. The executors are responsible for interpreting this text, and\nset the flags in the resulting node-value, and on the session under the\ntarget :flags key."}
              {:vars ({:ns pallet.core.version-dispatch,
                       :name os-match-less,
                       :file "pallet/core/version_dispatch.clj",
                       :column 1,
                       :internal true,
                       :line 72,
                       :var-type :fn,
                       :arglists ([hierarchy]),
                       :doc "A less for os, os-version and version matches."}
                      {:ns pallet.core.version-dispatch,
                       :name lookup-os,
                       :file "pallet/core/version_dispatch.clj",
                       :column 1,
                       :internal true,
                       :line 93,
                       :var-type :fn,
                       :arglists ([base
                                   version
                                   hierarchy
                                   base-key
                                   version-key
                                   values
                                   default-value]),
                       :doc "Pass nil to default-value if non required"}
                      {:ns pallet.core.version-dispatch,
                       :name version-spec-more-specific,
                       :file "pallet/core/version_dispatch.clj",
                       :column 1,
                       :line 13,
                       :var-type :fn,
                       :arglists ([spec1 spec2]),
                       :doc "Compare the specificity of two version vectors."}
                      {:ns pallet.core.version-dispatch,
                       :name match-less,
                       :file "pallet/core/version_dispatch.clj",
                       :column 1,
                       :internal true,
                       :line 53,
                       :var-type :fn,
                       :arglists ([hierarchy base-key version-key]),
                       :doc "A less for matches on a hierarchy and version."}
                      {:ns pallet.core.version-dispatch,
                       :name version-map,
                       :file "pallet/core/version_dispatch.clj",
                       :column 1,
                       :line 163,
                       :var-type :fn,
                       :arglists ([hierarchy
                                   base-key
                                   version-key
                                   os-value-pairs]
                                  [hierarchy base-key version-key]),
                       :doc "Construct a version map. The keys should be maps with `base-key` and\n`version-key` keys. The `base-key` value should be take from the\n`hierarchy`. The `version-key` value should be a version vector, or a version\nrange vector."}
                      {:var-type :fn,
                       :ns pallet.core.version-dispatch,
                       :name ->VersionMap,
                       :file "pallet/core/version_dispatch.clj",
                       :column 1,
                       :line 118,
                       :arglists ([data
                                   hierarchy
                                   base-key
                                   version-key]),
                       :doc "Positional factory function for class pallet.core.version_dispatch.VersionMap."}),
               :ns-name pallet.core.version-dispatch,
               :doc "Version dispatch.\n\nThis is based on dispatching over a map.  The map has a `base` key, which\nmust be part of a `hierarchy`. The map also has a `version-key`, with a\nvalue that must be a VersionSpec."}
              {:vars ({:ns pallet.crate.admin-user,
                       :name create-user-and-home,
                       :file "pallet/crate/admin_user.clj",
                       :column 1,
                       :line 46,
                       :var-type :fn,
                       :arglists ([session
                                   username
                                   create-user
                                   create-home
                                   user-options])}
                      {:ns pallet.crate.admin-user,
                       :name admin-user,
                       :file "pallet/crate/admin_user.clj",
                       :column 1,
                       :line 161,
                       :var-type :fn,
                       :arglists ([session]
                                  [session
                                   {:keys [username
                                           public-key-paths
                                           public-keys
                                           sudo
                                           create-user
                                           create-home
                                           user-options],
                                    :or {sudo true},
                                    :as options}]),
                       :doc "Add an admin user\n\nBuilds a user for use in remote-admin automation. The user is given\npermission to sudo without password, so that passwords don't have to appear\nin scripts, etc.\n\n`:username`\n: the username to create.  Defaults to the current admin user.\n\n`:public-key-paths`\n: a sequence of paths to public keys to be authorised on the user\n\n`:sudo`\n: a flag to add the user to sudoers.  Defaults to true.\n\n`:sudoers-args`\n: a vector of args for passing to sudoers. Defaults to password-less\nsudo access to everything.\n\n`:install-sudo`\n: a flag to install the sudoers package.  Defaults to true.\n\n`:create-user`\n: a flag to create the user.  Defaults to true if the user doesn't\nexist.\n\n`:create-home`\n: a flag to create the user's home directory.  Defauts to true.  When\nusers are managed by, e.g.  LDAP, you may need to set this to false.\n\n`:user-options`\n: a map of options to pass to the `user` action when creating the\nuser.\n"}
                      {:ns pallet.crate.admin-user,
                       :name authorize-user-key,
                       :file "pallet/crate/admin_user.clj",
                       :column 1,
                       :line 32,
                       :var-type :fn,
                       :arglists ([session username path-or-bytes]),
                       :doc "Authorise a single key, specified as a path or as a byte array."}
                      {:ns pallet.crate.admin-user,
                       :name default-settings,
                       :file "pallet/crate/admin_user.clj",
                       :column 1,
                       :line 20,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.crate.admin-user,
                       :name facility,
                       :file "pallet/crate/admin_user.clj",
                       :column 1,
                       :line 18,
                       :var-type :var}
                      {:ns pallet.crate.admin-user,
                       :name server-spec,
                       :file "pallet/crate/admin_user.clj",
                       :column 1,
                       :line 218,
                       :var-type :fn,
                       :arglists ([settings]),
                       :doc "Convenience server spec to add the current admin-user on bootstrap."}
                      {:ns pallet.crate.admin-user,
                       :name settings,
                       :file "pallet/crate/admin_user.clj",
                       :column 1,
                       :line 25,
                       :var-type :fn,
                       :arglists ([session settings])}
                      {:ns pallet.crate.admin-user,
                       :name UserSettings,
                       :file "pallet/crate/admin_user.clj",
                       :column 1,
                       :line 152,
                       :var-type :var}
                      {:ns pallet.crate.admin-user,
                       :name configure,
                       :file "pallet/crate/admin_user.clj",
                       :column 1,
                       :line 133,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [instance-id
                                           sudoers-instance-id],
                                    :as options}]),
                       :doc "Creates users, and Writes the configuration file for sudoers."}
                      {:ns pallet.crate.admin-user,
                       :name default-sudoers-args,
                       :file "pallet/crate/admin_user.clj",
                       :column 1,
                       :line 39,
                       :var-type :fn,
                       :arglists ([username])}),
               :ns-name pallet.crate.admin-user}
              {:vars ({:ns pallet.crate.automated-admin-user,
                       :name default-sudoers-args,
                       :file "pallet/crate/automated_admin_user.clj",
                       :column 1,
                       :line 33,
                       :var-type :fn,
                       :arglists ([username])}
                      {:ns pallet.crate.automated-admin-user,
                       :name configure,
                       :file "pallet/crate/automated_admin_user.clj",
                       :column 1,
                       :line 62,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [instance-id
                                           sudoers-instance-id],
                                    :as options}]),
                       :doc "Creates users, and Writes the configuration file for sudoers."}
                      {:ns pallet.crate.automated-admin-user,
                       :name create-admin-user,
                       :file "pallet/crate/automated_admin_user.clj",
                       :column 1,
                       :line 40,
                       :var-type :fn,
                       :arglists ([session]
                                  [session username]
                                  [session
                                   username
                                   &
                                   public-key-paths]),
                       :doc "Builds a user for use in remote-admin automation. The user is given\n  permission to sudo without password, so that passwords don't have to appear\n  in scripts, etc."}
                      {:ns pallet.crate.automated-admin-user,
                       :name settings,
                       :file "pallet/crate/automated_admin_user.clj",
                       :column 1,
                       :line 20,
                       :var-type :fn,
                       :arglists ([session
                                   settings
                                   &
                                   {:keys [instance-id], :as options}])}
                      {:ns pallet.crate.automated-admin-user,
                       :name with-automated-admin-user,
                       :file "pallet/crate/automated_admin_user.clj",
                       :column 1,
                       :line 75,
                       :var-type :var,
                       :doc "Convenience server spec to add the current admin-user on bootstrap."}
                      {:ns pallet.crate.automated-admin-user,
                       :name server-spec,
                       :file "pallet/crate/automated_admin_user.clj",
                       :column 1,
                       :line 88,
                       :var-type :fn,
                       :arglists ([options]),
                       :doc "Convenience server spec to add the current admin-user on bootstrap."}
                      {:ns pallet.crate.automated-admin-user,
                       :name facility,
                       :file "pallet/crate/automated_admin_user.clj",
                       :column 1,
                       :line 13,
                       :var-type :var}
                      {:ns pallet.crate.automated-admin-user,
                       :name default-settings,
                       :file "pallet/crate/automated_admin_user.clj",
                       :column 1,
                       :line 15,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.crate.automated-admin-user,
                       :name authorize-user-key,
                       :file "pallet/crate/automated_admin_user.clj",
                       :column 1,
                       :line 26,
                       :var-type :fn,
                       :arglists ([session username path-or-bytes]),
                       :doc "Authorise a single key, specified as a path or as a byte array."}),
               :ns-name pallet.crate.automated-admin-user}
              {:vars ({:ns pallet.crate.crontab,
                       :name user-crontabs,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 73,
                       :var-type :fn,
                       :arglists ([session
                                   &
                                   {:as arg21753,
                                    :keys [action],
                                    :or {action :create}}]),
                       :doc "Write all user crontab files."}
                      {:ns pallet.crate.crontab,
                       :name create-user-crontab,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 47,
                       :var-type :fn,
                       :arglists ([session user]),
                       :doc "Create user crontab for the given user."}
                      {:private true,
                       :ns pallet.crate.crontab,
                       :name system-cron-file,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 82,
                       :var-type :fn,
                       :arglists ([name]),
                       :doc "Path to system cron file for `name`"}
                      {:ns pallet.crate.crontab,
                       :name remove-user-crontab,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 63,
                       :var-type :fn,
                       :arglists ([session user]),
                       :doc "Remove user crontab for the specified user"}
                      {:ns pallet.crate.crontab,
                       :name user-settings,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 29,
                       :var-type :fn,
                       :arglists ([session user settings-map]),
                       :doc "Define the user's crontab settings.  The settings are a map of keyword\n  argument values for remote-file content."}
                      {:ns pallet.crate.crontab,
                       :name remove-system-crontab,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 100,
                       :var-type :fn,
                       :arglists ([session system]),
                       :doc "Remove system crontab for the given name"}
                      {:ns pallet.crate.crontab,
                       :name create-system-crontab,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 87,
                       :var-type :fn,
                       :arglists ([session system]),
                       :doc "Create system crontab for the given name."}
                      {:ns pallet.crate.crontab,
                       :name server-spec,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 116,
                       :var-type :fn,
                       :arglists ([settings])}
                      {:ns pallet.crate.crontab,
                       :name settings,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 15,
                       :var-type :fn,
                       :arglists ([session settings]),
                       :doc "Define the crontab settings.  The settings are a map from user name to a map\n   of keyword argument values for remote-file content (under :user) and a map\n   from system facility name to a map of keyword argument values for remote-file\n   content"}
                      {:private true,
                       :ns pallet.crate.crontab,
                       :name in-file,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 41,
                       :var-type :fn,
                       :arglists ([user])}
                      {:ns pallet.crate.crontab,
                       :name system-settings,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 35,
                       :var-type :fn,
                       :arglists ([session name settings-map]),
                       :doc "Define the system's crontab settings.  The settings are a map of keyword\n  argument values for remote-file content."}
                      {:ns pallet.crate.crontab,
                       :name empty-settings,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 23,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Define empty crontab settings. This can be used to ensure that settings are\n   available for crontab, independently of whether any are specified elsewhere."}
                      {:ns pallet.crate.crontab,
                       :name system-crontabs,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 107,
                       :var-type :fn,
                       :arglists ([session
                                   &
                                   {:as arg21768,
                                    :keys [action],
                                    :or {action :create}}]),
                       :doc "Write all system crontab files."}
                      {:ns pallet.crate.crontab,
                       :name system-cron-dir,
                       :file "pallet/crate/crontab.clj",
                       :column 1,
                       :line 13,
                       :var-type :var}),
               :ns-name pallet.crate.crontab,
               :doc "crontab management"}
              {:vars ({:ns pallet.crate.environment,
                       :name system-environment-file,
                       :file "pallet/crate/environment.clj",
                       :column 1,
                       :line 14,
                       :var-type :fn,
                       :arglists ([session
                                   env-name
                                   {:keys [path shared],
                                    :or {shared :pallet.crate.environment/not-set},
                                    :as options}])}
                      {:ns pallet.crate.environment,
                       :name system-environment,
                       :file "pallet/crate/environment.clj",
                       :column 1,
                       :line 24,
                       :var-type :fn,
                       :arglists ([session
                                   env-name
                                   key-value-pairs
                                   &
                                   {:keys [path shared literal],
                                    :as options}]),
                       :doc "Define system wide default environment.\n   On redhat based systems, this is set in /etc/profile.d, so is only\n   valid within a login shell. On debian based systems, /etc/environment\n   is used."}),
               :ns-name pallet.crate.environment,
               :doc "Set up the system environment."}
              {:vars ({:ns pallet.crate.etc-default,
                       :name write,
                       :file "pallet/crate/etc_default.clj",
                       :column 1,
                       :line 11,
                       :var-type :fn,
                       :arglists ([session filename & key-value-pairs]),
                       :doc "Writes a KEY=value file to /etc/default/~{filename}, or ~{filename} if\n   filename starts with a /.  Note that all values are quoted, and quotes in\n   values are escaped, but otherwise, values are written literally.\n\n   e.g. (write \"tomcat6\"\n          :JAVA_OPTS \"-Xmx1024m\"\n          \"JSP_COMPILER\" \"javac\")"}),
               :ns-name pallet.crate.etc-default,
               :doc "Generation and installation of /etc/default-style files."}
              {:vars ({:ns pallet.crate.etc-hosts,
                       :name ipv6-aliases,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 91,
                       :var-type :var}
                      {:ns pallet.crate.etc-hosts,
                       :name add-host,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([session ip-address names]),
                       :doc "Declare a host entry. Names should be a sequence of names."}
                      {:ns pallet.crate.etc-hosts,
                       :name merge-hosts,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 18,
                       :var-type :fn,
                       :arglists ([& ms])}
                      {:var-type :fn,
                       :ns pallet.crate.etc-hosts,
                       :name set-hostname*,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 126,
                       :arglists [[session hostname]]}
                      {:ns pallet.crate.etc-hosts,
                       :name localhost-hostname,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 87,
                       :var-type :fn,
                       :arglists ([& node-names])}
                      {:private true,
                       :ns pallet.crate.etc-hosts,
                       :name format-hosts*,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 104,
                       :var-type :fn,
                       :arglists ([entries])}
                      {:ns pallet.crate.etc-hosts,
                       :name hosts,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 113,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Writes the hosts files"}
                      {:ns pallet.crate.etc-hosts,
                       :name reverse-dns,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 46,
                       :var-type :fn,
                       :arglists ([session ip]),
                       :doc "Get the hostname reported for the specified ip."}
                      {:ns pallet.crate.etc-hosts,
                       :name localhost,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 84,
                       :var-type :var}
                      {:ns pallet.crate.etc-hosts,
                       :name hostname,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 37,
                       :var-type :fn,
                       :arglists ([session
                                   {:as arg21883, :keys [fqdn]}]),
                       :doc "Get the hostname as reported on the node."}
                      {:ns pallet.crate.etc-hosts,
                       :name add-hosts,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 29,
                       :var-type :fn,
                       :arglists ([session hosts-map]),
                       :doc "Add a map of ip address to a sequence of hostname/aliases, to the host file\n  settings."}
                      {:ns pallet.crate.etc-hosts,
                       :name format-hosts,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 108,
                       :var-type :fn,
                       :arglists ([session])}
                      {:ns pallet.crate.etc-hosts,
                       :name host-entry,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 65,
                       :var-type :fn,
                       :arglists ([session
                                   {:as arg21889,
                                    :keys [use-hostname
                                           use-private-ip],
                                    :or {use-hostname true,
                                         use-private-ip true}}]),
                       :doc "Get a host entry for the current node. Options all default to true\n  and hostname takes priority over target-name, and private-ip over\n  primary-ip."}
                      {:private true,
                       :ns pallet.crate.etc-hosts,
                       :name format-entry,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 100,
                       :var-type :fn,
                       :arglists ([entry])}
                      {:ns pallet.crate.etc-hosts,
                       :name resolve-dns,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 55,
                       :var-type :fn,
                       :arglists ([session hostname]),
                       :doc "Get the ip for a hostname."}
                      {:ns pallet.crate.etc-hosts,
                       :name set-hostname,
                       :file "pallet/crate/etc_hosts.clj",
                       :column 1,
                       :line 157,
                       :var-type :fn,
                       :arglists ([session
                                   &
                                   {:as arg21954,
                                    :keys [update-etc-hosts],
                                    :or {update-etc-hosts true}}]),
                       :doc "Set the hostname on a node. Note that sudo may stop working if the\nhostname is not in /etc/hosts."}),
               :ns-name pallet.crate.etc-hosts,
               :doc "/etc/hosts file."}
              {:vars ({:var-type :multi-method,
                       :ns pallet.crate.filesystem,
                       :name format-mount-option,
                       :file "pallet/crate/filesystem.clj",
                       :column 1,
                       :line 16}
                      {:ns pallet.crate.filesystem,
                       :name make-xfs-filesytem,
                       :file "pallet/crate/filesystem.clj",
                       :column 1,
                       :line 8,
                       :var-type :fn,
                       :arglists ([session device]),
                       :doc "Format a device as an XFS filesystem."}
                      {:private true,
                       :ns pallet.crate.filesystem,
                       :name mount-cmd-options,
                       :file "pallet/crate/filesystem.clj",
                       :column 1,
                       :line 28,
                       :var-type :fn,
                       :arglists ([options])}
                      {:ns pallet.crate.filesystem,
                       :name mount,
                       :file "pallet/crate/filesystem.clj",
                       :column 1,
                       :line 35,
                       :var-type :fn,
                       :arglists ([session
                                   device
                                   mount-point
                                   &
                                   {:keys [fs-type
                                           device-type
                                           automount
                                           no-automount
                                           dump-frequency
                                           boot-check-pass],
                                    :or {dump-frequency 0,
                                         boot-check-pass 0},
                                    :as options}]),
                       :doc "Mount a device."}),
               :ns-name pallet.crate.filesystem,
               :doc "Filesystem crate."}
              {:vars ({:ns pallet.crate.initd,
                       :name jobs,
                       :file "pallet/crate/initd.clj",
                       :column 1,
                       :line 38,
                       :var-type :fn,
                       :arglists ([{:keys [instance-id], :as options}]),
                       :doc "Write out job definitions."}
                      {:ns pallet.crate.initd,
                       :name server-spec,
                       :file "pallet/crate/initd.clj",
                       :column 1,
                       :line 74,
                       :var-type :fn,
                       :arglists ([settings
                                   &
                                   {:keys [instance-id], :as options}])}
                      {:ns pallet.crate.initd,
                       :name init-script-path,
                       :file "pallet/crate/initd.clj",
                       :column 1,
                       :line 19,
                       :var-type :fn,
                       :arglists ([service-name]),
                       :doc "Return the init script path for the given service name."}
                      {:ns pallet.crate.initd,
                       :name write-service,
                       :file "pallet/crate/initd.clj",
                       :column 1,
                       :line 28,
                       :var-type :fn,
                       :arglists ([service-name
                                   {:keys [init-file],
                                    :as service-options}
                                   options])}),
               :ns-name pallet.crate.initd,
               :doc "Provides service supervision via initd"}
              {:vars ({:private true,
                       :ns pallet.crate.limits-conf,
                       :name format-entry,
                       :file "pallet/crate/limits_conf.clj",
                       :column 1,
                       :line 56,
                       :var-type :fn,
                       :arglists ([{:keys [domain type item value],
                                    :or {type "-"}}])}
                      {:ns pallet.crate.limits-conf,
                       :name configure,
                       :file "pallet/crate/limits_conf.clj",
                       :column 1,
                       :line 64,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [instance-id], :as options}]),
                       :doc "Writes the limit.conf file."}
                      {:ns pallet.crate.limits-conf,
                       :name settings,
                       :file "pallet/crate/limits_conf.clj",
                       :column 1,
                       :line 30,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [entries
                                           config-file
                                           instance-id],
                                    :as settings}]),
                       :doc "Configure limits.conf settings.\n  The :entries value is a sequence of maps and vectors.  Each map must\n  specify :domain, :type, :item and :value fields.  Each vectors specifies\n  strings for the fields (in domain, type, item, value order).  The type and\n  item values may optionally be keywords."}
                      {:ns pallet.crate.limits-conf,
                       :name ulimit,
                       :file "pallet/crate/limits_conf.clj",
                       :column 1,
                       :line 43,
                       :var-type :fn,
                       :arglists ([session
                                   entry
                                   &
                                   {:keys [instance-id], :as options}]),
                       :doc "Declare a host entry.  This may be called multiple times to build limits\n  incrementally.\n\n  A host entry can be either a map with :domain, :type, :item and :value keys,\n  or a vector specifying strings for the fields (in domain, type, item, value\n  order).  The type and item values may optionally be keywords."}
                      {:ns pallet.crate.limits-conf,
                       :name server-spec,
                       :file "pallet/crate/limits_conf.clj",
                       :column 1,
                       :line 78,
                       :var-type :fn,
                       :arglists ([{:keys [entries config-file],
                                    :as settings}
                                   &
                                   {:keys [instance-id], :as options}]),
                       :doc "Return a server spec for limits.conf configuration.  See the `settings`\nfunction for options to the settings map"}
                      {:private true,
                       :ns pallet.crate.limits-conf,
                       :name normalise-entry,
                       :file "pallet/crate/limits_conf.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([entry]),
                       :doc "Normalise an entry into map form, which is how the entries are kept in\n  the settings map."}
                      {:ns pallet.crate.limits-conf,
                       :name default-settings,
                       :file "pallet/crate/limits_conf.clj",
                       :column 1,
                       :line 15,
                       :var-type :fn,
                       :arglists ([])}
                      {:private true,
                       :ns pallet.crate.limits-conf,
                       :name format-host-limits,
                       :file "pallet/crate/limits_conf.clj",
                       :column 1,
                       :line 60,
                       :var-type :fn,
                       :arglists ([entries])}),
               :ns-name pallet.crate.limits-conf,
               :doc "Configure the /etc/security/limits.conf file."}
              {:vars ({:ns pallet.crate.network-service,
                       :name wait-for-port-response,
                       :file "pallet/crate/network_service.clj",
                       :column 1,
                       :line 97,
                       :var-type :fn,
                       :arglists ([session
                                   port
                                   message
                                   response-regex
                                   &
                                   {:as arg22192,
                                    :keys [host
                                           timeout
                                           max-retries
                                           standoff
                                           service-name],
                                    :or {host "localhost",
                                         max-retries 5,
                                         standoff 2,
                                         timeout 2,
                                         service-name (str
                                                       "port "
                                                       port)}}]),
                       :doc "Wait for a port to respond to a message with a given response regex.\n\n   Options:\n   - :host          host to check (defaults to localhost)\n   - :timeout       time to wait for a response (default 2 secs)\n   - :standoff      time between checking HTTP status (seconds)\n   - :max-retries   number of times to test HTTP status before erroring\n   - :service-name  name of service to use in messages (defaults to port)"}
                      {:ns pallet.crate.network-service,
                       :name wait-for-port-listen,
                       :file "pallet/crate/network_service.clj",
                       :column 1,
                       :line 8,
                       :var-type :fn,
                       :arglists ([session
                                   port
                                   &
                                   {:as arg22183,
                                    :keys [max-retries
                                           standoff
                                           service-name
                                           protocol],
                                    :or {max-retries 5,
                                         standoff 2,
                                         protocol :tcp,
                                         service-name (str
                                                       "port "
                                                       port)}}]),
                       :doc "Wait for the network port `port` to be in a listening state.\n\n   Options:\n   - :standoff      time between checking port state (seconds)\n   - :max-retries   number of times to test port state before erroring\n   - :service-name  name of service to use in messages (defaults to port)\n   - :protocol      name of the network protocol family (:raw, :tcp, :udp or :udplite, defaults to :tcp)"}
                      {:ns pallet.crate.network-service,
                       :name wait-for-http-status,
                       :file "pallet/crate/network_service.clj",
                       :column 1,
                       :line 43,
                       :var-type :fn,
                       :arglists ([session
                                   url
                                   status
                                   &
                                   {:as arg22188,
                                    :keys [max-retries
                                           standoff
                                           url-name
                                           cookie
                                           insecure
                                           ssl-version],
                                    :or {max-retries 5,
                                         standoff 2,
                                         url-name url}}]),
                       :doc "Wait for a url to respond with the given HTTP status code.\n\n   Options:\n   - :standoff      time between checking HTTP status (seconds)\n   - :max-retries   number of times to test HTTP status before erroring\n   - :url-name      name of url to use in messages (defaults to url)"}),
               :ns-name pallet.crate.network-service,
               :doc "Crate for working with network services"}
              {:vars ({:ns pallet.crate.node-info,
                       :name os,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 139,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Infer OS and distribution.  Puts a map into the settings' :pallet/os\n  facility."}
                      {:ns pallet.crate.node-info,
                       :name node-info!,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 30,
                       :var-type :fn,
                       :arglists ([session node-details]),
                       :doc "Set the node os information map"}
                      {:ns pallet.crate.node-info,
                       :name node-info-merge!,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 36,
                       :var-type :fn,
                       :arglists ([session node-details]),
                       :doc "Merge the os-details into the node os information map"}
                      {:ns pallet.crate.node-info,
                       :name node-info,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([session target]),
                       :doc "Return the node information in settings for the specified target."}
                      {:ns pallet.crate.node-info,
                       :name os-detection,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 48,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Returns a script, that when executed, should identify the os of a unix\n  target."}
                      {:ns pallet.crate.node-info,
                       :name facility,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 19,
                       :var-type :var}
                      {:ns pallet.crate.node-info,
                       :name pre-map-output,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 98,
                       :var-type :var}
                      {:ns pallet.crate.node-info,
                       :name server-spec,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 154,
                       :var-type :fn,
                       :arglists ([{:keys [all-targets], :as settings}]),
                       :doc "Return a spec with pallet os-detection phases.  When all-targets is\n  false, the default, it will only run on targets without a specified\n  os-family."}
                      {:ns pallet.crate.node-info,
                       :name infer-distro,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 121,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Infer the linux distribution from a node"}
                      {:ns pallet.crate.node-info,
                       :name target-with-os,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 42,
                       :var-type :fn,
                       :arglists ([target plan-state]),
                       :doc "Adds any inferred os details to a target"}
                      {:ns pallet.crate.node-info,
                       :name distro-detection,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 59,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Returns a script, that when executed, should identify distro of a linux\n  target."}
                      {:ns pallet.crate.node-info,
                       :name infer-os,
                       :file "pallet/crate/node_info.clj",
                       :column 1,
                       :line 100,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Infer the OS family and version from a node"}),
               :ns-name pallet.crate.node-info,
               :doc "Detection of node information, e.g to determine os and version"}
              {:vars ({:ns pallet.crate.nohup,
                       :name start-nohup-service,
                       :file "pallet/crate/nohup.clj",
                       :column 1,
                       :line 68,
                       :var-type :fn,
                       :arglists ([session service-name user])}
                      {:ns pallet.crate.nohup,
                       :name write-service,
                       :file "pallet/crate/nohup.clj",
                       :column 1,
                       :line 42,
                       :var-type :fn,
                       :arglists ([session
                                   service-name
                                   {:keys [run-file user],
                                    :as service-options}
                                   options])}
                      {:ns pallet.crate.nohup,
                       :name service-script-output-path,
                       :file "pallet/crate/nohup.clj",
                       :column 1,
                       :line 32,
                       :var-type :fn,
                       :arglists ([service-name])}
                      {:ns pallet.crate.nohup,
                       :name server-spec,
                       :file "pallet/crate/nohup.clj",
                       :column 1,
                       :line 122,
                       :var-type :fn,
                       :arglists ([settings
                                   &
                                   {:keys [instance-id], :as options}])}
                      {:ns pallet.crate.nohup,
                       :name service-script-file,
                       :file "pallet/crate/nohup.clj",
                       :column 1,
                       :line 23,
                       :var-type :fn,
                       :arglists ([service-name filename]
                                  [service-name])}
                      {:ns pallet.crate.nohup,
                       :name stop-nohup-service,
                       :file "pallet/crate/nohup.clj",
                       :column 1,
                       :line 84,
                       :var-type :fn,
                       :arglists ([session service-name user])}
                      {:ns pallet.crate.nohup,
                       :name nohup-path,
                       :file "pallet/crate/nohup.clj",
                       :column 1,
                       :line 20,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.crate.nohup,
                       :name service-script-path,
                       :file "pallet/crate/nohup.clj",
                       :column 1,
                       :line 29,
                       :var-type :fn,
                       :arglists ([service-name])}
                      {:ns pallet.crate.nohup,
                       :name jobs,
                       :file "pallet/crate/nohup.clj",
                       :column 1,
                       :line 53,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [instance-id], :as options}]),
                       :doc "Write out job definitions."}
                      {:ns pallet.crate.nohup,
                       :name service-script-failed-path,
                       :file "pallet/crate/nohup.clj",
                       :column 1,
                       :line 35,
                       :var-type :fn,
                       :arglists ([service-name])}),
               :ns-name pallet.crate.nohup,
               :doc "Provides supervision via nohup.  Note that this is very limited, and not\n  really recommended for production use."}
              {:vars ({:ns pallet.crate.package.centos,
                       :name add-repository,
                       :file "pallet/crate/package/centos.clj",
                       :column 1,
                       :line 20,
                       :var-type :fn,
                       :arglists ([session
                                   {:as arg22332,
                                    :keys [version
                                           repository
                                           enabled
                                           priority],
                                    :or {version "5.5",
                                         repository "os",
                                         enabled 0,
                                         priority 50}}]),
                       :doc "Add a centos repository. By default, ensure that it has a lower than default\n  priority."}
                      {:ns pallet.crate.package.centos,
                       :name arch,
                       :file "pallet/crate/package/centos.clj",
                       :column 1,
                       :line 16,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Return the centos package architecture for the target node."}
                      {:private true,
                       :ns pallet.crate.package.centos,
                       :name centos-repo-key,
                       :file "pallet/crate/package/centos.clj",
                       :column 1,
                       :line 13,
                       :var-type :var}
                      {:private true,
                       :ns pallet.crate.package.centos,
                       :name centos-repo,
                       :file "pallet/crate/package/centos.clj",
                       :column 1,
                       :line 10,
                       :var-type :var}),
               :ns-name pallet.crate.package.centos,
               :doc "Actions for working with the centos repositories"}
              {:vars ({:ns pallet.crate.package.debian-backports,
                       :name add-debian-backports,
                       :file "pallet/crate/package/debian_backports.clj",
                       :column 1,
                       :line 10,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [url mirror release scopes],
                                    :or {mirror "ftp.us.debian.org"},
                                    :as options}]),
                       :doc "Add debian backport package repository."}),
               :ns-name pallet.crate.package.debian-backports,
               :doc "Actions for working with the debian backports repository"}
              {:vars ({:ns pallet.crate.package.epel,
                       :name add-epel,
                       :file "pallet/crate/package/epel.clj",
                       :column 1,
                       :line 10,
                       :var-type :fn,
                       :arglists ([session
                                   {:as arg21190,
                                    :keys [version],
                                    :or {version "5-4"}}]),
                       :doc "Add the EPEL repository"}),
               :ns-name pallet.crate.package.epel,
               :doc "Actions for working with the epel repository"}
              {:vars ({:ns pallet.crate.package.jpackage,
                       :name jpackage-utils,
                       :file "pallet/crate/package/jpackage.clj",
                       :column 1,
                       :line 24,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Add jpackge-utils. Due to incompatibilities on RHEL derived distributions,\n   a compatability package is required.\n\n   https://bugzilla.redhat.com/show_bug.cgi?id=260161\n   https://bugzilla.redhat.com/show_bug.cgi?id=497213"}
                      {:ns pallet.crate.package.jpackage,
                       :name package-manager-update-jpackage,
                       :file "pallet/crate/package/jpackage.clj",
                       :column 1,
                       :line 134,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Update the package lists for the jpackage repositories"}
                      {:ns pallet.crate.package.jpackage,
                       :name add-jpackage,
                       :file "pallet/crate/package/jpackage.clj",
                       :column 1,
                       :line 53,
                       :var-type :fn,
                       :arglists ([session
                                   {:as arg22354,
                                    :keys [version
                                           component
                                           releasever
                                           enabled],
                                    :or {component "redhat-el",
                                         releasever "$releasever",
                                         version "5.0",
                                         enabled 0}}]),
                       :doc "Add the jpackage repository.  component should be one of:\n     fedora\n     redhat-el\n\n   Installs the jpackage-utils package from the base repos at a\n   priority of 25."}
                      {:ns pallet.crate.package.jpackage,
                       :name jpackage-mirror-fmt,
                       :file "pallet/crate/package/jpackage.clj",
                       :column 1,
                       :line 46,
                       :var-type :var}
                      {:ns pallet.crate.package.jpackage,
                       :name jpackage-utils-compat-rpm,
                       :file "pallet/crate/package/jpackage.clj",
                       :column 1,
                       :line 20,
                       :var-type :var}
                      {:ns pallet.crate.package.jpackage,
                       :name mirrorlist,
                       :file "pallet/crate/package/jpackage.clj",
                       :column 1,
                       :line 49,
                       :var-type :fn,
                       :arglists ([dist type release])}),
               :ns-name pallet.crate.package.jpackage,
               :doc "Actions for working with the jpackage repository"}
              {:vars ({:ns pallet.crate.package.rpmforge,
                       :name add-rpmforge,
                       :file "pallet/crate/package/rpmforge.clj",
                       :column 1,
                       :line 15,
                       :var-type :fn,
                       :arglists ([session
                                   {:as arg22378,
                                    :keys [version distro arch],
                                    :or {version "0.5.2-2",
                                         distro "el5",
                                         arch "i386"}}]),
                       :doc "Add the rpmforge repository"}
                      {:private true,
                       :ns pallet.crate.package.rpmforge,
                       :name rpmforge-url-pattern,
                       :file "pallet/crate/package/rpmforge.clj",
                       :column 1,
                       :line 10,
                       :var-type :var}),
               :ns-name pallet.crate.package.rpmforge,
               :doc "Actions for working with the rpmforge repository"}
              {:vars ({:ns pallet.crate.package,
                       :name PackageSpec,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 24,
                       :var-type :var}
                      {:ns pallet.crate.package,
                       :name PackageRepo,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 19,
                       :var-type :var}
                      {:ns pallet.crate.package,
                       :name package*,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 42,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [package-name
                                           repository
                                           version],
                                    :as pkg}
                                   {:keys [instance-id], :as options}]),
                       :doc "Add a package to the packages list."}
                      {:ns pallet.crate.package,
                       :name package-repository*,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 57,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [repository enable],
                                    :as repo}
                                   {:keys [instance-id], :as options}]),
                       :doc "Add a package repository to the packages list."}
                      {:ns pallet.crate.package,
                       :name install,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 82,
                       :var-type :fn,
                       :arglists ([session {:keys [instance-id]}]),
                       :doc "Install package repositories and packages."}
                      {:ns pallet.crate.package,
                       :name package,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 50,
                       :var-type :fn,
                       :arglists ([session
                                   package-name
                                   &
                                   {:keys [repository
                                           version
                                           instance-id],
                                    :as options}]),
                       :doc "Add a package to the packages list."}
                      {:ns pallet.crate.package,
                       :name facility,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 40,
                       :var-type :var}
                      {:ns pallet.crate.package,
                       :name server-spec,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 94,
                       :var-type :fn,
                       :arglists ([{:keys [packages
                                           package-repositories
                                           instance-id],
                                    :as options}]),
                       :doc "Return a server spec that will install packages, as specified\nby calls to `package` and `package-repository`"}
                      {:ns pallet.crate.package,
                       :name PackageSettings,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 32,
                       :var-type :var}
                      {:ns pallet.crate.package,
                       :name settings,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 74,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [packages
                                           package-repositories
                                           instance-id],
                                    :as options}]),
                       :doc "Initialise package repositories and packages to be installed."}
                      {:ns pallet.crate.package,
                       :name package-repository,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 66,
                       :var-type :fn,
                       :arglists ([session
                                   repository
                                   {:keys [instance-id], :as options}]),
                       :doc "Add a package repository to the packages list."}
                      {:private true,
                       :ns pallet.crate.package,
                       :name conj-distinct,
                       :file "pallet/crate/package.clj",
                       :column 1,
                       :line 36,
                       :var-type :fn,
                       :arglists ([coll arg])}),
               :ns-name pallet.crate.package,
               :doc "A crate to control packages on a remote node."}
              {:vars ({:ns pallet.crate.package-repo,
                       :name repository-packages,
                       :file "pallet/crate/package_repo.clj",
                       :column 1,
                       :line 29,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Install packages required for building repositories"}
                      {:ns pallet.crate.package-repo,
                       :name rebuild-repository,
                       :file "pallet/crate/package_repo.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([session path]),
                       :doc "Rebuild repository indexes for the repository at path"}
                      {:ns pallet.crate.package-repo,
                       :name rebuild-repo,
                       :file "pallet/crate/package_repo.clj",
                       :column 1,
                       :line 13,
                       :var-type :fn,
                       :arglists ([path])}),
               :ns-name pallet.crate.package-repo,
               :doc "Package repositories"}
              {:vars ({:var-type :multi-method,
                       :ns pallet.crate.service,
                       :name service-supervisor-available?,
                       :file "pallet/crate/service.clj",
                       :column 1,
                       :line 23,
                       :doc "Predicate to test if a given service implementation is available."}
                      {:ns pallet.crate.service,
                       :name supervisor-config,
                       :file "pallet/crate/service.clj",
                       :column 1,
                       :line 124,
                       :var-type :fn,
                       :arglists ([session
                                   facility
                                   {:keys [supervisor], :as settings}
                                   options]),
                       :doc "Configure service supervision for facility based on configuration map.\n\nSupervisor specific options are specified under the supervisor key in the\nsettings map.\n\nThis is intended to be called at the crate level."}
                      {:var-type :multi-method,
                       :ns pallet.crate.service,
                       :name service-supervisor-config,
                       :file "pallet/crate/service.clj",
                       :column 1,
                       :line 51,
                       :doc "Configure a service implementation based on configuration map.  The `config`\nmap is specific to the supervisor.  The initial enabled status of a config is\nsupervisor specific."}
                      {:ns pallet.crate.service,
                       :name service,
                       :file "pallet/crate/service.clj",
                       :column 1,
                       :line 71,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [supervisor service-name],
                                    :as settings}
                                   {:keys [action
                                           if-flag
                                           if-stopped
                                           instance-id],
                                    :as options}]),
                       :doc "Control a process under supervision.\n\nThe settings map must provide `:service-name` and `:supervisor` keys.  The\n`:supervisor` key specifies a keyword for the supervisor provider to dispatch\nto.  The `:service-name` provides a service name to be used by the supervision\nprovider.  It is not an error to call with `:action :start` if the process is\nalready running.\n\n`:action`\nOne of `:enable`, `:disable`, `:start`, `:stop`, `:restart`, `:status`. Defaults\nto :start.\n\n`:if-stopped`\nFlag to only apply the action if the service is currently stopped.\n\n`:if-flag`\nFlag to only apply the action only if the specified flag is set.\n\n`:instance-id`\nSpecifies an instance id, should there be more than one instance of the\nsupervisor (not the facility)."}
                      {:var-type :multi-method,
                       :ns pallet.crate.service,
                       :name supervisor-config-map,
                       :file "pallet/crate/service.clj",
                       :column 1,
                       :line 101,
                       :doc "Return a service configuration map for the given supervisor and facility.\n\nA method should be implemented in each crate for each supervisor to be\nsupported."}
                      {:var-type :multi-method,
                       :ns pallet.crate.service,
                       :name service-supervisor,
                       :file "pallet/crate/service.clj",
                       :column 1,
                       :line 30,
                       :doc "Provides an open dispatched supervisor implementation.\n\nImplement a method dispatched on the supervisor keyword to add a\nsupervisor implementation.\n\nIn options:\n\n`:action`\n: the action to be performed.  Should support `:start`, `:stop` and `:restart`.\n\n`:instance-id`\n: specifies the supervisor instance-id, not the facility instance-id.\n\nThe :start action should not complain if the service is already running.\n\nThe :restart action should not complain if the service is not running.\n\nThe :stop action should not complain if the service is not running."}),
               :ns-name pallet.crate.service,
               :doc "Run services under supervision.\n\nThis crate provides a framework for a process under supervision.  It can be\nextended by different supervision providers, by providing methods for the\nvarious multi-methods.  A crate can provide configuration for use with a range\nof supervision providers.\n\nTo control a service, the `service` function is used.\n\nTo configure a job for a service, implement a supervisor-config-map for the\nfacility and supervision service you wish to use.  Ensure the `server-spec` for\nthe supervision implementation is extended by your group-spec.\n\nTo create an implementation for a new service supervision provider, implement\nmethods for `service-supervisor-available?`, `service-supervisor` and\n`service-supervisor-config`."}
              {:vars ({:ns pallet.crate.ssh-key,
                       :name authorize-key,
                       :file "pallet/crate/ssh_key.clj",
                       :column 1,
                       :line 24,
                       :var-type :fn,
                       :arglists ([session
                                   user
                                   public-key-string
                                   &
                                   {:as arg21139,
                                    :keys [authorize-for-user]}]),
                       :doc "Authorize a public key on the specified user."}
                      {:ns pallet.crate.ssh-key,
                       :name ssh-default-filenames,
                       :file "pallet/crate/ssh_key.clj",
                       :column 1,
                       :line 80,
                       :var-type :var}
                      {:ns pallet.crate.ssh-key,
                       :name install-key,
                       :file "pallet/crate/ssh_key.clj",
                       :column 1,
                       :line 64,
                       :var-type :fn,
                       :arglists ([session
                                   user
                                   key-name
                                   private-key-string
                                   public-key-string]),
                       :doc "Install a ssh private key."}
                      {:ns pallet.crate.ssh-key,
                       :name generate-key,
                       :file "pallet/crate/ssh_key.clj",
                       :column 1,
                       :line 85,
                       :var-type :fn,
                       :arglists ([session
                                   user
                                   &
                                   {:keys [type
                                           filename
                                           passphrase
                                           no-dir
                                           comment],
                                    :or {type "rsa", passphrase ""},
                                    :as options}]),
                       :doc "Generate an ssh key pair for the given user, unless one already\n   exists. Options are:\n     :filename path -- output file name (within ~user/.ssh directory)\n     :type key-type -- key type selection\n     :no-dir true   -- do note ensure directory exists\n     :passphrase    -- new passphrase for encrypting the private key\n     :comment       -- comment for new key"}
                      {:ns pallet.crate.ssh-key,
                       :name config,
                       :file "pallet/crate/ssh_key.clj",
                       :column 1,
                       :line 132,
                       :var-type :fn,
                       :arglists ([session
                                   host
                                   key-value-map
                                   &
                                   {:as arg21159,
                                    :keys [user config-file],
                                    :or {user (:username
                                               (admin-user session))}}]),
                       :doc "Update an ssh config file. Sets the configuration for `host` to be that given\nby the key-value-map.  Optionally allows specification of the `user` whose ssh\nconfig file is to be modified, and the full `config-file` path."}
                      {:ns pallet.crate.ssh-key,
                       :name user-ssh-dir,
                       :file "pallet/crate/ssh_key.clj",
                       :column 1,
                       :line 18,
                       :var-type :fn,
                       :arglists ([user])}
                      {:ns pallet.crate.ssh-key,
                       :name public-key,
                       :file "pallet/crate/ssh_key.clj",
                       :column 1,
                       :line 117,
                       :var-type :fn,
                       :arglists ([session
                                   user
                                   &
                                   {:keys [filename dir type],
                                    :or {type "rsa"},
                                    :as options}]),
                       :doc "Returns the public key for the specified remote `user`. By default it returns\nthe user's id_rsa key from `~user/.ssh/id_rsa.pub`.\n\nYou can specify a different key type by passing :type. This assumes the public\nkey has a `.pub` extension.\n\nPassing a :filename value allows direct specification of the filename.\n\n`:dir` allows specification of a different location."}
                      {:ns pallet.crate.ssh-key,
                       :name authorize-key-for-localhost,
                       :file "pallet/crate/ssh_key.clj",
                       :column 1,
                       :line 43,
                       :var-type :fn,
                       :arglists ([session
                                   user
                                   public-key-filename
                                   &
                                   {:keys [authorize-for-user],
                                    :as options}]),
                       :doc "Authorize a user's public key on the specified user, for ssh access to\n  localhost.  The :authorize-for-user option can be used to specify the\n  user to who's authorized_keys file is modified."}),
               :ns-name pallet.crate.ssh-key,
               :doc "Crate functions for manipulating SSH-keys"}
              {:vars ({:private true,
                       :ns pallet.crate.sudoers,
                       :name tag-or-vector,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 159,
                       :var-type :fn,
                       :arglists ([item])}
                      {:ns pallet.crate.sudoers,
                       :name default-specs,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 98,
                       :var-type :fn,
                       :arglists ([session])}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name aliases,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 150,
                       :var-type :fn,
                       :arglists ([aliases])}
                      {:ns pallet.crate.sudoers,
                       :name SpecValue,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 45,
                       :var-type :var}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name write-spec,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 182,
                       :var-type :fn,
                       :arglists ([[user-spec host-spec]])}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name write-defaults,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 118,
                       :var-type :fn,
                       :arglists ([type name defaults])}
                      {:ns pallet.crate.sudoers,
                       :name SpecKey,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 38,
                       :var-type :var}
                      {:ns pallet.crate.sudoers,
                       :name install,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 94,
                       :var-type :fn,
                       :arglists ([session
                                   {:as arg21421, :keys [instance-id]}])}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name defaults-for,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 123,
                       :var-type :fn,
                       :arglists ([defaults key type])}
                      {:ns pallet.crate.sudoers,
                       :name default-settings,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 69,
                       :var-type :fn,
                       :arglists ([session])}
                      {:ns pallet.crate.sudoers,
                       :name facility,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 24,
                       :var-type :var}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name sudoer-merge,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 209,
                       :var-type :fn,
                       :arglists ([args])}
                      {:ns pallet.crate.sudoers,
                       :name server-spec,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 277,
                       :var-type :fn,
                       :arglists ([{:keys [], :as settings}
                                   &
                                   {:keys [instance-id], :as options}]),
                       :doc "Returns a server-spec that installs sudoers in the configure phase."}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name aliases-for,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 144,
                       :var-type :fn,
                       :arglists ([aliases key type])}
                      {:ns pallet.crate.sudoers,
                       :name settings,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 86,
                       :var-type :fn,
                       :arglists ([session
                                   settings
                                   &
                                   {:keys [instance-id], :as options}])}
                      {:ns pallet.crate.sudoers,
                       :name Aliases,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 26,
                       :var-type :var}
                      {:ns pallet.crate.sudoers,
                       :name SpecKeyOrKeys,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 41,
                       :var-type :var}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name write-aliases,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 139,
                       :var-type :fn,
                       :arglists ([type name aliased])}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name write-host-spec,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 176,
                       :var-type :fn,
                       :arglists ([host-spec])}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name defaults,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 131,
                       :var-type :fn,
                       :arglists ([defaults])}
                      {:ns pallet.crate.sudoers,
                       :name DefaultsValue,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 29,
                       :var-type :var}
                      {:ns pallet.crate.sudoers,
                       :name configure,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 259,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [instance-id], :as options}]),
                       :doc "Install the sudoers configuration based on settings"}
                      {:ns pallet.crate.sudoers,
                       :name Specs,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 52,
                       :var-type :var}
                      {:ns pallet.crate.sudoers,
                       :name sudoers-config,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 191,
                       :var-type :fn,
                       :arglists ([[aliases-map default-map spec-map]])}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name merge-user-spec,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 198,
                       :var-type :fn,
                       :arglists ([m1 m2])}
                      {:ns pallet.crate.sudoers,
                       :name Settings,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 77,
                       :var-type :var}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name specs,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 188,
                       :var-type :fn,
                       :arglists ([spec-map])}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name write-cmd-spec,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 169,
                       :var-type :fn,
                       :arglists ([[cmds options]])}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name param-string,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 107,
                       :var-type :fn,
                       :arglists ([[key value]])}
                      {:ns pallet.crate.sudoers,
                       :name Defaults,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 32,
                       :var-type :var}
                      {:ns pallet.crate.sudoers,
                       :name sudoers,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 229,
                       :var-type :fn,
                       :arglists ([session
                                   aliases
                                   defaults
                                   specs
                                   {:keys [instance-id], :as options}]),
                       :doc "Sudo configuration. Generates a sudoers file.\nBy default, root and an admin group are already present.\n\nExamples of the arguments are:\n\naliases { :user { :ADMINS [ \"user1\" \"user2\" ] }\n          :host { :TRUSTED [ \"host1\" ] }\n          :run-as-user { :OP [ \"root\" \"sysop\" ] }\n          :cmnd { :KILL [ \"kill\" ]\n                  :SHELLS [ \"/usr/bin/sh\" \"/usr/bin/csh\" \"/usr/bin/ksh\"]}}\ndefault-map { :default { :fqdn true }\n              :host { \"host\" { :lecture false } }\n              :user { \"user\" { :lecture false } }\n              :run-as-user { \"sysop\" { :lecture false } } }\nspecs [ { [\"user1\" \"user2\"]\n          { :host :TRUSTED\n            :KILL { :run-as-user \"operator\" :tags :NOPASSWORD }\n            [\"/usr/bin/*\" \"/usr/local/bin/*\"]\n            { :run-as-user \"root\" :tags [:NOEXEC :NOPASSWORD} }"}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name as-tag,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 156,
                       :var-type :fn,
                       :arglists ([item])}
                      {:private true,
                       :ns pallet.crate.sudoers,
                       :name item-or-vector,
                       :file "pallet/crate/sudoers.clj",
                       :column 1,
                       :line 164,
                       :var-type :fn,
                       :arglists ([item])}),
               :ns-name pallet.crate.sudoers}
              {:vars ({:var-type :fn,
                       :ns pallet.crate-install,
                       :name install-from,
                       :file "pallet/crate_install.clj",
                       :column 1,
                       :line 37,
                       :arglists [[session settings]],
                       :doc "Install based on a map.  The :install-strategy key determines\n  the install strategy used.  Each strategy has it's own set of keywords\n  used to configure the strategy.\n\n## `:packages`\n\n`:packages`\n: a sequence of strings specifying the package names\n\n`:package-options`\n: a map of package options, as accepted by the `package` action.\n\n`:preseeds`\n: a map of keywords and values  used to set preseeds for the packages.\n\n\n## `:package-source`\n\nInstall based on the setting's :package-source and :packages keys.\nThis will cause a package update if the package source definition\nchanges.\n\n`:package-source`\nA map of options as accepted by the `package-source` action.\n\n`:repository`\nA keyword that enables a repository with an implementation in the\n`repository` action multimethod.\n\nThe packages to be installed are specified as for the `:packages`\ninstall strategy.\n\n\n## `:rpm`\nInstall based on a rpm\n\nThe value is a map specifying the source of the rpm, using options as\nper the `remote-file` action.\n\n\n## `:rpm-repo`\n\nInstall based on a rpm that installs a package repository source.\n\n`:rpm`\n: remote-file options to specify the rpm that will install the\nrepository source.\n\n`:packages`\n: a sequence of package names to install from the repository.\n\n`:package-options`\n: package options, as per the `:packages` install strategy.\n\n## `:deb`\n\nUpload a deb archive repository. Options for the :debs key are as for\nremote-directory (e.g. a :local-file key with a path to a local tar\nfile). Pallet uploads the deb files, creates a repository from them,\nthen installs from the repository.\n\n`:debs`\n: remote-directory options for the source of the deb  package-source packages\n\n`:packages`\n: a sequence of package names to install from the repository.\n\n`:package-source`\n: a package source definition for the repository\n\n\n## `:archive`\n\nInstall based on an archive\n\n`:install-dir`\n: a path where the archive should be installed.\n\n`:install-source`\n: remote-directory options specifying the source of the archive."}
                      {:var-type :fn,
                       :ns pallet.crate-install,
                       :name install,
                       :file "pallet/crate_install.clj",
                       :column 1,
                       :line 146,
                       :arglists [[session facility instance-id]]}
                      {:ns pallet.crate-install,
                       :name crate-install-settings,
                       :file "pallet/crate_install.clj",
                       :column 1,
                       :line 25,
                       :var-type :var}),
               :ns-name pallet.crate-install,
               :doc "Install methods for crates"}
              {:vars ({:ns pallet.environment.protocols,
                       :name has-environment?,
                       :file "pallet/environment/protocols.clj",
                       :column 1,
                       :line 9,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate to test if x is capable of supplying an environment map."}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.environment.protocols,
                                  :doc "Returns an environment map",
                                  :arglists ([_]),
                                  :name environment}),
                       :var-type :protocol,
                       :doc "A protocol for accessing an environment.",
                       :ns pallet.environment.protocols,
                       :name Environment,
                       :file "pallet/environment/protocols.clj",
                       :column 1,
                       :line 5}),
               :ns-name pallet.environment.protocols,
               :doc "Environment protocols"}
              {:vars ({:private true,
                       :ns pallet.environment,
                       :name eval-action-options,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 143,
                       :var-type :fn,
                       :arglists ([{:keys [file-backup
                                           file-checksum
                                           file-uploader],
                                    :as options}]),
                       :doc "Evaluate an action-option map.  This will construct action options\n  from keywords, if present.\n  e.g :file-uploader [:sftp {}]"}
                      {:ns pallet.environment,
                       :name eval-environment,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 177,
                       :var-type :fn,
                       :arglists ([env-map]),
                       :doc "Evaluate an environment literal.  This is used to replace certain keys with\n   objects constructed from the map of values provided.  The keys that are\n   evaluated are:\n   - `:user`\n   - `:phases`\n   - `:algorithms`"}
                      {:ns pallet.environment,
                       :name user-keys-to-shell-expand,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 175,
                       :var-type :var}
                      {:private true,
                       :ns pallet.environment,
                       :name eval-algorithms,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 131,
                       :var-type :fn,
                       :arglists ([algorithms]),
                       :doc "Evaluate an algorithm map.  This will attempt to require any namespaces\n   mentioned and will then lookup each symbol to retrieve the specified\n   var."}
                      {:private true,
                       :ns pallet.environment,
                       :name eval-phase,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 106,
                       :var-type :fn,
                       :arglists ([phase]),
                       :doc "Evaluate a phase definition."}
                      {:ns pallet.environment,
                       :name has-environment?,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 38,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate to test if x is capable of supplying an environment map."}
                      {:ns pallet.environment,
                       :name pipeline,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 88,
                       :var-type :fn,
                       :arglists ([a b])}
                      {:ns pallet.environment,
                       :name shell-expand-keys,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 165,
                       :var-type :fn,
                       :arglists ([user-map keys]),
                       :doc "Shell-expand the values matching the specified keys"}
                      {:ns pallet.environment,
                       :name get-environment,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 220,
                       :var-type :fn,
                       :arglists ([session keys]
                                  [session keys default]),
                       :doc "Retrieve the effective environment value at the path specified by keys.\n   When no default value is specified, then raise an `:environment-not-found` if\n   no environment value is set.\n\n       (get-environment session [:p :a :d])"}
                      {:private true,
                       :ns pallet.environment,
                       :name eval-phases,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 118,
                       :var-type :fn,
                       :arglists ([phases]),
                       :doc "Evaluate a phase map.  This will attempt to require any namespaces mentioned\n   and will then read each phase definition."}
                      {:ns pallet.environment,
                       :name merge-environment,
                       :file "pallet/environment.clj",
                       :column 1,
                       :internal true,
                       :line 214,
                       :var-type :fn,
                       :arglists ([session environment]),
                       :doc "Merge an environment into the effective environment.  Returns a modified\n  session."}
                      {:ns pallet.environment,
                       :name merge-environments,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 79,
                       :var-type :fn,
                       :arglists ([& maps]),
                       :doc "Returns a map that consists of the rest of the maps merged onto the\n  first.  If a key occurs in more than one map, the mapping(s) from\n  the latter (left-to-right) will be combined with the mapping in the\n  result by calling `(merge-key key val-in-result val-in-latter)`."}
                      {:ns pallet.environment,
                       :name environment,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 43,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Return an environment map from x."}
                      {:ns pallet.environment,
                       :name merge-key-algorithm,
                       :file "pallet/environment.clj",
                       :column 1,
                       :line 55,
                       :var-type :var,
                       :doc "Map specifying how environments are merged.  Associates keys to\n  merge algorithms."}),
               :ns-name pallet.environment,
               :doc "The environments provide mechanisms for customising Pallet and\n   Pallet crates according to externally determined criteria.  It is a\n   protocol, which is implemented on records to return a data map, an\n   algorithm that allows merging these data maps, and access to these\n   values in the plan state.\n\n   In plan-fns, the environment should be considered read-only.\n\n   An environment can be specified at the global, service, invocation and tag\n   scopes.\n\n   To provide a global default, specify an `:environment` key at the top level\n   of `defpallet` in `~/.pallet/config.clj`.\n\n   To provide a service specific default, specify an `:environment` key at the\n   service level of `defpallet` in `~/.pallet/config.clj`.\n\n   To provide a project specific default, define `pallet.config/environment`.\n\n   To provide a specific environment when invoking `lift` or `converge`, pass an\n   environment map using the `:environment` key.\n\n   The merging of values between scopes is key specific, and is determined by\n   `merge-key-algorithm`."}
              {:vars ({:ns pallet.exception,
                       :name compiler-exception,
                       :file "pallet/exception.clj",
                       :column 1,
                       :internal true,
                       :line 8,
                       :var-type :fn,
                       :arglists ([form msg data] [form msg]),
                       :doc "Return a compiler exception.  This is should be used to throw in\n  macros defining top level forms, as clojure doesn't wrap these in\n  Compiler$CompilerException."}
                      {:ns pallet.exception,
                       :name domain-error?,
                       :file "pallet/exception.clj",
                       :column 1,
                       :line 23,
                       :var-type :fn,
                       :arglists ([exception]),
                       :doc "Predicate to test for a domain error.  Domain errors are not thrown\n  but are recorded in the results."}
                      {:ns pallet.exception,
                       :name domain-info,
                       :file "pallet/exception.clj",
                       :column 1,
                       :line 29,
                       :var-type :fn,
                       :arglists ([msg data] [msg data cause]),
                       :doc "Return an exception that is marked as a domain exception."}
                      {:ns pallet.exception,
                       :name combine-exceptions,
                       :file "pallet/exception.clj",
                       :column 1,
                       :internal true,
                       :line 36,
                       :var-type :fn,
                       :arglists ([exceptions message data]
                                  [exceptions data]
                                  [exceptions]),
                       :doc "Wrap a sequence of exceptions into a single exception.  The first\n  element of the sequence is used as the cause of the composite\n  exception.  Removes any nil values in the input exceptions\n  sequence.  The exceptions are listed in the :exceptions key of\n  the exception data."}),
               :ns-name pallet.exception,
               :doc "Exception functions"}
              {:vars ({:ns pallet.feature,
                       :name has-feature?,
                       :file "pallet/feature.clj",
                       :column 1,
                       :line 11,
                       :macro true,
                       :var-type :macro,
                       :arglists ([feature]),
                       :doc "Predicate to test for feature availability"}
                      {:ns pallet.feature,
                       :name when-feature,
                       :file "pallet/feature.clj",
                       :column 1,
                       :line 16,
                       :macro true,
                       :var-type :macro,
                       :arglists ([feature & body]),
                       :doc "Predicate to test for feature availability"}
                      {:ns pallet.feature,
                       :name has-feature?*,
                       :file "pallet/feature.clj",
                       :column 1,
                       :line 6,
                       :var-type :fn,
                       :arglists ([feature])}
                      {:indent 1,
                       :ns pallet.feature,
                       :name if-feature,
                       :file "pallet/feature.clj",
                       :column 1,
                       :line 28,
                       :macro true,
                       :var-type :macro,
                       :arglists ([feature true-expr false-expr]),
                       :doc "Predicate to test for feature availability"}
                      {:ns pallet.feature,
                       :name when-not-feature,
                       :file "pallet/feature.clj",
                       :column 1,
                       :line 22,
                       :macro true,
                       :var-type :macro,
                       :arglists ([feature & body]),
                       :doc "Predicate to test for feature availability"}),
               :ns-name pallet.feature,
               :doc "Pallet feature recognition.\n\n   A feature is implemented as a function within the pallet.feature namespace"}
              {:vars ({:ns pallet.group,
                       :name LiftOptions,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 69,
                       :var-type :var}
                      {:ns pallet.group,
                       :name group-deltas,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 375,
                       :var-type :fn,
                       :arglists ([target-specs groups]),
                       :doc "Calculate actual and required counts for a sequence of groups. Returns a map\n  from group to a map with :actual and :target counts."}
                      {:ns pallet.group,
                       :name check-group-spec,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 93,
                       :var-type :fn,
                       :arglists ([m])}
                      {:ns pallet.group,
                       :name cluster-spec,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 228,
                       :var-type :fn,
                       :arglists ([cluster-name
                                   &
                                   {:keys [extends
                                           groups
                                           phases
                                           node-spec
                                           roles],
                                    :as options}]),
                       :doc "Create a cluster-spec.\n\n   `name` is used as a prefix for all groups in the cluster.\n\n   - :groups    specify a sequence of groups that define the cluster\n\n   - :extends   specify a server-spec, a group-spec, or sequence thereof\n                for all groups in the cluster\n\n   - :phases    define phases on all groups.\n\n   - :node-spec default node-spec for the nodes in the cluster\n\n   - :roles     roles for all group-specs in the cluster"}
                      {:ns pallet.group,
                       :name group-with-environment,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 346,
                       :var-type :fn,
                       :arglists ([environment group]),
                       :doc "Add the environment to a group."}
                      {:ns pallet.group,
                       :name target-has-group-name?,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 114,
                       :var-type :fn,
                       :arglists ([node group-name]),
                       :doc "Return a predicate to check if a target node has the specified group name.\n  If the node is taggable, we check the group-name-tag, otherwise we\n  fall back onto checking the whether the node's base-name matches the\n  group name."}
                      {:ns pallet.group,
                       :name target-in-group?,
                       :file "pallet/group.clj",
                       :column 1,
                       :internal true,
                       :line 125,
                       :var-type :fn,
                       :arglists ([node group]),
                       :doc "Check if a node satisfies a group's node-filter."}
                      {:ns pallet.group,
                       :name phase-errors,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 941,
                       :var-type :fn,
                       :arglists ([result]),
                       :doc "Return a sequence of phase errors for an operation.\n   Each element in the sequence represents a failed action, and is a map,\n   with :target, :error, :context and all the return value keys for the return\n   value of the failed action."}
                      {:ns pallet.group,
                       :name group-add-spec,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 418,
                       :var-type :fn,
                       :arglists ([{:keys [group delta actual],
                                    :as group-delta}])}
                      {:ns pallet.group,
                       :name check-converge-options,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 101,
                       :var-type :fn,
                       :arglists ([m])}
                      {:ns pallet.group,
                       :name create-groups-nodes-phase,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 519,
                       :var-type :fn,
                       :arglists ([session
                                   compute-service
                                   group-add-specs]),
                       :doc "Return a phase to create nodes for groups."}
                      {:ns pallet.group,
                       :name node-has-group-name?,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 136,
                       :var-type :fn,
                       :arglists ([group target])}
                      {:ns pallet.group,
                       :name lift,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 879,
                       :var-type :fn,
                       :arglists ([node-set
                                   &
                                   {:keys [compute
                                           phase
                                           user
                                           all-node-set
                                           environment
                                           async
                                           timeout-ms
                                           timeout-val
                                           partition-f
                                           post-phase-f
                                           post-phase-fsm
                                           phase-execution-f
                                           execution-settings-f
                                           debug
                                           plan-state],
                                    :as options}]),
                       :doc "Lift the running nodes in the specified node-set by applying the specified\nphases.  The compute service may be supplied as an option, otherwise the\nbound compute-service is used.  The configure phase is applied by default\nunless other phases are specified.\n\nnode-set can be a group spec, a sequence of group specs, or a map\nof group specs to nodes. Examples:\n\n    [group-spec1 group-spec2 {group-spec #{node1 node2}}]\n    group-spec\n    {group-spec #{node1 node2}}\n\n## Options:\n\n`:compute`\n: a compute service.\n\n`:blobstore`\n: a blobstore service.\n\n`:phase`\n: a phase keyword, phase function, or sequence of these.\n\n`:user`\nthe admin-user on the nodes.\n\n### Asynchronous and Timeouts\n\n`:async`\n: a flag to control whether the function executes asynchronously.  When truthy,\n  the function returns an Operation that can be deref'd like a future.  When not\n  truthy, `:timeout-ms` may be used to specify a timeout.  Defaults to nil.\n\n`:timeout-ms`\n: an integral number of milliseconds to wait for completion before timeout.\n  Only applies if `:async` is not truthy (the default).\n\n`:timeout-val`\n: a value to be returned should the operation time out.\n\n### OS detection\n\n`:os-detect`\n: controls detection of nodes' os (default true)."}
                      {:ns pallet.group,
                       :name ConvergeOptions,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 87,
                       :var-type :var}
                      {:ns pallet.group,
                       :name group-removal-specs,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 405,
                       :var-type :fn,
                       :arglists ([group-deltas]),
                       :doc "Finds the specified number of nodes to be removed from the given groups.\n  Nodes are selected at random. Returns a map from group to a map with\n  :servers and :all, where :servers is a sequence of severs to remove, and :all\n  is a boolean that is true if all nodes are being removed."}
                      {:ns pallet.group,
                       :name EnvironmentStrict,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 56,
                       :var-type :var}
                      {:ns pallet.group,
                       :name node-count-adjuster,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 534,
                       :var-type :fn,
                       :arglists ([session
                                   compute-service
                                   groups
                                   targets
                                   ch]),
                       :doc "Adjusts node counts. Groups are expected to have node counts on them.\n  Return a map.  The :new-targets key will contain a sequence of new\n  targets; the :old-targets a sequence of removed targets,\n  and :results a sequence of phase results from\n  the :destroy-server, :destroy-group, and :create-group phases."}
                      {:ns pallet.group,
                       :name all-group-nodes,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 614,
                       :var-type :fn,
                       :arglists ([compute groups all-node-set]),
                       :doc "Returns the service state for the specified groups"}
                      {:ns pallet.group,
                       :name throw-phase-errors,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 956,
                       :var-type :fn,
                       :arglists ([result])}
                      {:ns pallet.group,
                       :name group-spec,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 142,
                       :var-type :fn,
                       :arglists ([name
                                   {:keys [extends
                                           count
                                           image
                                           phases
                                           phases-meta
                                           default-phases
                                           packager
                                           node-spec
                                           roles
                                           node-filter],
                                    :as options}]),
                       :doc "Create a group-spec.  A group spec is a server spec, with additional\n  keys for matching nodes.\n\n   `name` is used for the group name, which is set on each node and links a node\n   to its node-spec\n\n   - :extends        specify a server-spec, a group-spec, or sequence thereof\n                     and is used to inherit phases, etc.\n\n   - :phases         used to define phases. Standard phases are:\n   - :phases-meta    metadata to add to the phases\n   - :default-phases a sequence specifying the default phases\n   - :bootstrap      run on first boot of a new node\n   - :configure      defines the configuration of the node.\n\n   - :count          specify the target number of nodes for this node-spec\n   - :packager       override the choice of packager to use\n   - :node-spec      default node-spec for this group-spec\n   - :node-filter    a predicate that tests if a node is a member of this\n                     group. Will be called with the group-spec and a node.\n\n   - :removal-selection-fn a function that will be called to select\n                           nodes for removal. Arguments are the number of\n                           nodes to select and a sequence of current nodes."}
                      {:ns pallet.group,
                       :name expand-group-spec-with-counts,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 200,
                       :var-type :fn,
                       :arglists ([node-set spec-count] [node-set]),
                       :doc "Expand a converge node spec into its groups"}
                      {:ns pallet.group,
                       :name environment-args,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 629,
                       :var-type :var,
                       :doc "Arguments that are forwarded to be part of the environment"}
                      {:ns pallet.group,
                       :name groups-with-role,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 295,
                       :var-type :fn,
                       :arglists ([session role]),
                       :doc "All target groups with the specified role."}
                      {:ns pallet.group,
                       :name remove-group-nodes-phase,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 448,
                       :var-type :fn,
                       :arglists ([session
                                   compute-service
                                   group
                                   remove-group
                                   targets]),
                       :doc "Removes `targets` from `group`. If `:remove-group` is true, then\n  all nodes for the group are being removed, and the group should be\n  removed.  Puts a result onto the output channel, ch, as a rex-tuple\n  where the value is a map with :destroy-servers, :old-node-ids, and\n  destroy-groups keys."}
                      {:private true,
                       :ns pallet.group,
                       :name groups-with-phases,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 569,
                       :var-type :fn,
                       :arglists ([groups phase-map]),
                       :doc "Adds the phases from phase-map into each group in the sequence `groups`."}
                      {:ns pallet.group,
                       :name group-removal-spec,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 389,
                       :var-type :fn,
                       :arglists ([{:keys [group
                                           target
                                           target-specs
                                           delta],
                                    :as spec}]),
                       :doc "Return a map describing the group and targets to be removed."}
                      {:ns pallet.group,
                       :name known-targets-phase,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 642,
                       :var-type :fn,
                       :arglists ([known-target-specs]),
                       :doc "Return a phase that will set the result :target-specs with the\n  known-target-specs, less the :old-targets and with\n  the :new-target-specs."}
                      {:ns pallet.group,
                       :name split-groups-and-targets,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 586,
                       :var-type :fn,
                       :arglists ([node-set]),
                       :doc "Split a node-set into groups and targets. Returns a map with\n:groups and :targets keys"}
                      {:ns pallet.group,
                       :name remove-groups-nodes-phase,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 470,
                       :var-type :fn,
                       :arglists ([session
                                   compute-service
                                   removal-specs]),
                       :doc "Return a phase function that removes targets from groups according\n  to the removal-specs sequence.  The result is written to the\n  channel, ch.  Each removal-spec is a map with :group, :remove-group\n  and :targets keys."}
                      {:ns pallet.group,
                       :name group-add-specs,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 424,
                       :var-type :fn,
                       :arglists ([group-deltas]),
                       :doc "Finds the specified number of nodes to be removed from the given groups.\n  Nodes are selected at random. Returns a map from group to a map with\n  :servers and :all, where :servers is a sequence of severs to remove, and :all\n  is a boolean that is true if all nodes are being removed."}
                      {:ns pallet.group,
                       :name lift-options,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 637,
                       :var-type :var,
                       :doc "A sequence of keywords, listing the lift-options"}
                      {:ns pallet.group,
                       :name nodes-in-group,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 283,
                       :var-type :fn,
                       :arglists ([session group-name]),
                       :doc "All nodes in the same tag as the target-node, or with the specified\n  group-name."}
                      {:ns pallet.group,
                       :name GroupSpec,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 61,
                       :var-type :var}
                      {:ns pallet.group,
                       :name target-scopes,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 270,
                       :var-type :fn,
                       :arglists ([target])}
                      {:ns pallet.group,
                       :name role->nodes-map,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 313,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Returns a map from role to nodes."}
                      {:ns pallet.group,
                       :name check-lift-options,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 97,
                       :var-type :fn,
                       :arglists ([m])}
                      {:ns pallet.group,
                       :name nodes-with-role,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 304,
                       :var-type :fn,
                       :arglists ([session role]),
                       :doc "All target nodes with the specified role."}
                      {:ns pallet.group,
                       :name node-keys,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 343,
                       :var-type :var,
                       :doc "node-specific environment keys"}
                      {:ns pallet.group,
                       :name group-node-maps,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 632,
                       :var-type :fn,
                       :arglists ([compute
                                   groups
                                   &
                                   {:keys [async
                                           timeout-ms
                                           timeout-val],
                                    :as options}]),
                       :doc "Return the nodes for the specified groups."}
                      {:ns pallet.group,
                       :name lift*,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 803,
                       :var-type :fn,
                       :arglists ([node-set
                                   ch
                                   {:keys [compute
                                           phase
                                           all-node-set
                                           environment
                                           debug
                                           plan-state
                                           os-detect
                                           executor],
                                    :or {os-detect true,
                                         executor (ssh/ssh-executor)},
                                    :as options}]),
                       :doc "Asynchronously execute a lift of phases on the node-set.  Options\n  as specified in `lift`."}
                      {:ns pallet.group,
                       :name group-name-tag,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 110,
                       :var-type :var,
                       :doc "The name of the tag used to record the group name on the node."}
                      {:ns pallet.group,
                       :name target-phases,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 435,
                       :var-type :fn,
                       :arglists ([target-specs phases])}
                      {:ns pallet.group,
                       :name converge*,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 664,
                       :var-type :fn,
                       :arglists ([group-spec->count
                                   ch
                                   {:keys [compute
                                           blobstore
                                           user
                                           phase
                                           all-nodes
                                           all-node-set
                                           environment
                                           plan-state
                                           debug
                                           os-detect
                                           executor],
                                    :or {os-detect true,
                                         executor (ssh/ssh-executor)},
                                    :as options}]),
                       :doc "Converge the existing compute resources with the counts\n   specified in `group-spec->count`.  Options are as for `converge`.\n   The result is written to the channel, ch."}
                      {:var-type :fn,
                       :ns pallet.group,
                       :name service-state,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 327,
                       :arglists ([nodes groups]),
                       :doc "For a sequence of nodes, filter those nodes in the specified\n  `groups`. Returns a sequence that contains a target-spec map for each\n  matching target.\n\n## Function Signatures\n\n  - [Node] [GroupSpec] -> [TargetSpec]",
                       :sig [[[{(optional-key :compute-service) pallet.compute.protocols.ComputeService,
                                (optional-key :user) (both
                                                      (pred
                                                       has-credentials?)
                                                      {(optional-key
                                                        :public-key) (either
                                                                      java.lang.String
                                                                      bytes),
                                                       (optional-key
                                                        :sudo-password) java.lang.String,
                                                       (optional-key
                                                        :private-key-path) java.lang.String,
                                                       (optional-key
                                                        :password) java.lang.String,
                                                       :username java.lang.String,
                                                       (optional-key
                                                        :temp-key) java.lang.Boolean,
                                                       (optional-key
                                                        :public-key-path) java.lang.String,
                                                       (optional-key
                                                        :passphrase) (either
                                                                      java.lang.String
                                                                      bytes),
                                                       (optional-key
                                                        :no-sudo) java.lang.Boolean,
                                                       (optional-key
                                                        :private-key) (either
                                                                       java.lang.String
                                                                       bytes),
                                                       (optional-key
                                                        :sudo-user) java.lang.String}),
                                :os-family Keyword,
                                :packager Keyword,
                                (optional-key :run-state) (enum
                                                           :suspended
                                                           :running
                                                           :stopped
                                                           :terminated),
                                (optional-key :os-version) java.lang.String,
                                (optional-key :hardware) {Keyword Any},
                                (optional-key :ssh-port) Int,
                                (optional-key :image-user) {(optional-key
                                                             :public-key) (either
                                                                           java.lang.String
                                                                           bytes),
                                                            (optional-key
                                                             :sudo-password) java.lang.String,
                                                            (optional-key
                                                             :private-key-path) java.lang.String,
                                                            (optional-key
                                                             :password) java.lang.String,
                                                            :username java.lang.String,
                                                            (optional-key
                                                             :temp-key) java.lang.Boolean,
                                                            (optional-key
                                                             :public-key-path) java.lang.String,
                                                            (optional-key
                                                             :passphrase) (either
                                                                           java.lang.String
                                                                           bytes),
                                                            (optional-key
                                                             :no-sudo) java.lang.Boolean,
                                                            (optional-key
                                                             :private-key) (either
                                                                            java.lang.String
                                                                            bytes),
                                                            (optional-key
                                                             :sudo-user) java.lang.String},
                                (optional-key :private-ip) (maybe
                                                            java.lang.String),
                                (optional-key :primary-ip) (maybe
                                                            java.lang.String),
                                (optional-key :is-64bit) java.lang.Boolean,
                                :id java.lang.String,
                                (optional-key :provider-data) {Keyword Any},
                                (optional-key :arch) java.lang.String,
                                (optional-key :hostname) java.lang.String,
                                (optional-key :proxy) {:port Int}}]
                              [{(optional-key :phases-meta) {Keyword {(optional-key
                                                                       :middleware) clojure.lang.IFn,
                                                                      (optional-key
                                                                       :phase-middleware) clojure.lang.IFn}},
                                (optional-key :roles) #{Keyword},
                                (optional-key :count) java.lang.Number,
                                (optional-key :default-phases) [Keyword],
                                (optional-key :packager) Keyword,
                                (optional-key :override) {(optional-key
                                                           :packager) Keyword,
                                                          (optional-key
                                                           :os-family) Keyword,
                                                          (optional-key
                                                           :os-version) java.lang.String},
                                :group-name Keyword,
                                (optional-key :removal-selection-fn) clojure.lang.IFn,
                                (optional-key :phases) {Keyword clojure.lang.IFn},
                                (optional-key :node-filter) clojure.lang.IFn,
                                (optional-key :node-spec) {(optional-key
                                                            :image) {:image-id (either
                                                                                java.lang.String
                                                                                Keyword),
                                                                     :os-family Keyword,
                                                                     (optional-key
                                                                      :packager) Keyword,
                                                                     Keyword Any},
                                                           (optional-key
                                                            :location) {(optional-key
                                                                         :location-id) java.lang.String,
                                                                        Keyword Any},
                                                           (optional-key
                                                            :hardware) {(optional-key
                                                                         :hardware-id) java.lang.String,
                                                                        (optional-key
                                                                         :min-ram) java.lang.Number,
                                                                        (optional-key
                                                                         :min-cores) java.lang.Number,
                                                                        (optional-key
                                                                         :min-disk) java.lang.Number,
                                                                        Keyword Any},
                                                           (optional-key
                                                            :network) {(optional-key
                                                                        :inbound-ports) [(either
                                                                                          {:start-port java.lang.Number,
                                                                                           (optional-key
                                                                                            :end-port) java.lang.Number,
                                                                                           (optional-key
                                                                                            :protocol) java.lang.String}
                                                                                          java.lang.Number)],
                                                                       Keyword Any},
                                                           (optional-key
                                                            :qos) {(optional-key
                                                                    :spot-price) java.lang.Number,
                                                                   (optional-key
                                                                    :enable-monitoring) java.lang.Boolean,
                                                                   Keyword Any},
                                                           (optional-key
                                                            :provider) {Keyword Any},
                                                           Keyword Any}}]
                              :-
                              [{:target {Any Any},
                                :spec {Any Any,
                                       (optional-key :phases) {Keyword clojure.lang.IFn},
                                       (optional-key :roles) #{Keyword},
                                       (optional-key :packager) Keyword,
                                       (optional-key :phases-meta) {Keyword {(optional-key
                                                                              :middleware) clojure.lang.IFn,
                                                                             (optional-key
                                                                              :phase-middleware) clojure.lang.IFn}},
                                       (optional-key :default-phases) [Keyword],
                                       (optional-key :override) {(optional-key
                                                                  :packager) Keyword,
                                                                 (optional-key
                                                                  :os-family) Keyword,
                                                                 (optional-key
                                                                  :os-version) java.lang.String}}}]]]}
                      {:ns pallet.group,
                       :name lift-target-specs-when-no-errors-phase,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 655,
                       :var-type :fn,
                       :arglists ([session phase-spec]),
                       :doc "Return a function that will execute the specified phase-spec\n  on :target-specs if there are no errors in previous results."}
                      {:ns pallet.group,
                       :name expand-cluster-groups,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 576,
                       :var-type :fn,
                       :arglists ([node-set]),
                       :doc "Expand a node-set into its groups"}
                      {:ns pallet.group,
                       :name node-count-adjuster-phase,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 562,
                       :var-type :fn,
                       :arglists ([session compute groups nodes-set])}
                      {:ns pallet.group,
                       :name phase-error-exceptions,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 949,
                       :var-type :fn,
                       :arglists ([result]),
                       :doc "Return a sequence of exceptions from phase errors for an operation. "}
                      {:ns pallet.group,
                       :name group-delta,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 357,
                       :var-type :fn,
                       :arglists ([target-specs group]),
                       :doc "Calculate actual and required counts for a group"}
                      {:ns pallet.group,
                       :name create-group-nodes-phase,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 483,
                       :var-type :fn,
                       :arglists ([session
                                   compute-service
                                   group
                                   count
                                   create-group]),
                       :doc "Return a phase function to create `count` nodes for a `group`."}
                      {:ns pallet.group,
                       :name converge,
                       :file "pallet/group.clj",
                       :column 1,
                       :line 743,
                       :var-type :fn,
                       :arglists ([group-spec->count
                                   &
                                   {:keys [compute
                                           blobstore
                                           user
                                           phase
                                           all-nodes
                                           all-node-set
                                           environment
                                           async
                                           timeout-ms
                                           timeout-val
                                           debug
                                           plan-state],
                                    :as options}]),
                       :doc "Converge the existing compute resources with the counts specified in\n`group-spec->count`. New nodes are started, or nodes are destroyed to obtain the\nspecified node counts.\n\n`group-spec->count` can be a map from group-spec to node count, or can be a\nsequence of group-specs containing a :count key.\n\nThis applies the `:bootstrap` phase to all new nodes and, by default,\nthe :configure phase to all running nodes whose group-name matches a key in the\nnode map.  Phases can also be specified with the `:phase` option, and will be\napplied to all matching nodes.  The :configure phase is the default phase\napplied.\n\n## Options\n\n`:compute`\n: a compute service.\n\n`:blobstore`\n: a blobstore service.\n\n`:phase`\n: a phase keyword, phase function, or sequence of these.\n\n`:user`\nthe admin-user on the nodes.\n\n### Asynchronous and Timeouts\n\n`:async`\n: a flag to control whether the function executes asynchronously.  When truthy,\n  the function returns an Operation that can be deref'd like a future.  When not\n  truthy, `:timeout-ms` may be used to specify a timeout.  Defaults to nil.\n\n`:timeout-ms`\n: an integral number of milliseconds to wait for completion before timeout.\n  Only applies if `:async` is not truthy (the default).\n\n`:timeout-val`\n: a value to be returned should the operation time out.\n\n### OS detection\n\n`:os-detect`\n: controls detection of nodes' os (default true)."}),
               :ns-name pallet.group,
               :doc "Pallet Group functions for adjusting groups of nodes\n\nProvides the group-spec abstraction.\n\nProvides the lift and converge operations.\n\nUses a TargetMap to describe a node with its group-spec info."}
              {:vars ({:ns pallet.kb,
                       :name admin-group,
                       :file "pallet/kb.clj",
                       :column 1,
                       :line 65,
                       :var-type :fn,
                       :arglists ([os-family os-version]),
                       :doc "Default admin group for host"}
                      {:ns pallet.kb,
                       :name os-hierarchy,
                       :file "pallet/kb.clj",
                       :column 1,
                       :line 11,
                       :var-type :var}
                      {:ns pallet.kb,
                       :name packager-map,
                       :file "pallet/kb.clj",
                       :column 1,
                       :line 41,
                       :var-type :var}
                      {:ns pallet.kb,
                       :name packager-for-os,
                       :file "pallet/kb.clj",
                       :column 1,
                       :line 51,
                       :var-type :fn,
                       :arglists ([os-family os-version]),
                       :doc "Package manager"}),
               :ns-name pallet.kb,
               :doc "A knowledge base for pallet"}
              {:vars ({:ns pallet.local.execute,
                       :name local-connection,
                       :file "pallet/local/execute.clj",
                       :column 1,
                       :line 17,
                       :var-type :var}
                      {:ns pallet.local.execute,
                       :name local-script-expand,
                       :file "pallet/local/execute.clj",
                       :column 1,
                       :line 124,
                       :var-type :fn,
                       :arglists ([expr]),
                       :doc "Expand a script expression."}
                      {:ns pallet.local.execute,
                       :name verify-sh-return,
                       :file "pallet/local/execute.clj",
                       :column 1,
                       :line 20,
                       :var-type :fn,
                       :arglists ([msg cmd result]),
                       :doc "Verify the return code of a sh execution"}
                      {:ns pallet.local.execute,
                       :name build-code,
                       :file "pallet/local/execute.clj",
                       :column 1,
                       :line 38,
                       :var-type :fn,
                       :arglists ([session action tmpfile]),
                       :doc "Build the code with defaults for local execution."}
                      {:private true,
                       :ns pallet.local.execute,
                       :name local-script-dir,
                       :file "pallet/local/execute.clj",
                       :column 1,
                       :line 46,
                       :var-type :fn,
                       :arglists ([{:keys [script-dir]}])}
                      {:ns pallet.local.execute,
                       :name local-checked-script,
                       :file "pallet/local/execute.clj",
                       :column 1,
                       :line 115,
                       :macro true,
                       :var-type :macro,
                       :arglists ([msg & body]),
                       :doc "Run a script on the local machine, setting up stevedore to produce the\n   correct target specific code.  The return code is checked."}
                      {:ns pallet.local.execute,
                       :name clojure-on-origin,
                       :file "pallet/local/execute.clj",
                       :column 1,
                       :line 93,
                       :var-type :fn,
                       :arglists ([session
                                   {:keys [script-dir], :as action}
                                   f]),
                       :doc "Execute a clojure function on the origin"}
                      {:ns pallet.local.execute,
                       :name script-on-origin,
                       :file "pallet/local/execute.clj",
                       :column 1,
                       :line 53,
                       :var-type :fn,
                       :arglists ([user action [options value]]),
                       :doc "Execute a script action on the origin"}
                      {:ns pallet.local.execute,
                       :name local-script-context,
                       :file "pallet/local/execute.clj",
                       :column 1,
                       :line 99,
                       :macro true,
                       :var-type :macro,
                       :arglists ([& body]),
                       :doc "Run a script on the local machine, setting up stevedore to produce the\n   correct target specific code"}
                      {:ns pallet.local.execute,
                       :name local-script,
                       :file "pallet/local/execute.clj",
                       :column 1,
                       :line 107,
                       :macro true,
                       :var-type :macro,
                       :arglists ([& body]),
                       :doc "Run a script on the local machine, setting up stevedore to produce the\n   correct target specific code"}),
               :ns-name pallet.local.execute,
               :doc "Local execution of pallet actions"}
              {:vars ({:var-type :var,
                       :ns pallet.log,
                       :name memory-ch,
                       :file "pallet/log.clj",
                       :column 1,
                       :line 74,
                       :doc "Async logging channel"}
                      {:ns pallet.log,
                       :name dev-log-config,
                       :file "pallet/log.clj",
                       :column 1,
                       :line 78,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.log,
                       :name start-memory-sink,
                       :file "pallet/log.clj",
                       :column 1,
                       :line 83,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.log,
                       :name default-log-config,
                       :file "pallet/log.clj",
                       :column 1,
                       :line 64,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Set a default log configuration"}
                      {:ns pallet.log,
                       :name timbre-config,
                       :file "pallet/log.clj",
                       :column 1,
                       :line 30,
                       :var-type :var,
                       :doc "A basic timbre configuration for use with pallet."}
                      {:var-type :var,
                       :ns pallet.log,
                       :name memory,
                       :file "pallet/log.clj",
                       :column 1,
                       :line 70,
                       :doc "Async logging memory"}
                      {:ns pallet.log,
                       :name format-with-domain-context,
                       :file "pallet/log.clj",
                       :column 1,
                       :line 14,
                       :var-type :fn,
                       :arglists ([{:keys [level
                                           throwable
                                           message
                                           timestamp
                                           hostname
                                           ns
                                           domain
                                           context]}
                                   &
                                   [{:keys [nofonts?],
                                     :as appender-fmt-output-opts}]]),
                       :doc "A formatter that shows domain rather than ns when it is set, and\n  adds any :context values."}
                      {:ns pallet.log,
                       :name clear-memory!,
                       :file "pallet/log.clj",
                       :column 1,
                       :line 101,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.log,
                       :name stop-memory-sink,
                       :file "pallet/log.clj",
                       :column 1,
                       :line 92,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.log,
                       :name pprint-memory-args,
                       :file "pallet/log.clj",
                       :column 1,
                       :line 97,
                       :var-type :fn,
                       :arglists ([])}),
               :ns-name pallet.log,
               :doc "Logging configuration for pallet."}
              {:vars ({:ns pallet.middleware,
                       :name execute-on-unflagged,
                       :file "pallet/middleware.clj",
                       :column 1,
                       :line 65,
                       :var-type :fn,
                       :arglists ([handler state-flag]),
                       :doc "Return an action middleware, that will execute a phase on nodes\n  that have the specified state flag set."}
                      {:ns pallet.middleware,
                       :name execute-one-shot-flag,
                       :file "pallet/middleware.clj",
                       :column 1,
                       :line 34,
                       :var-type :fn,
                       :arglists ([handler state-flag]),
                       :doc "Return a middleware, that will execute a phase on targets that\n  don't have the specified state flag set. On successful completion the targets\n  have the state flag set."}
                      {:ns pallet.middleware,
                       :name execute-on-flagged,
                       :file "pallet/middleware.clj",
                       :column 1,
                       :line 58,
                       :var-type :fn,
                       :arglists ([handler state-flag]),
                       :doc "Return an action middleware, that will execute a phase on nodes\n  that have the specified state flag set."}
                      {:ns pallet.middleware,
                       :name execute-on-filtered,
                       :file "pallet/middleware.clj",
                       :column 1,
                       :line 47,
                       :var-type :fn,
                       :arglists ([handler filter-f]),
                       :doc "Return a function, that will execute a phase on targets that\n  return true when applied to the filter-f function."}
                      {:ns pallet.middleware,
                       :name image-user-middleware,
                       :file "pallet/middleware.clj",
                       :column 1,
                       :line 12,
                       :var-type :fn,
                       :arglists ([handler]),
                       :doc "Returns a middleware for setting the admin user to the image credentials."}),
               :ns-name pallet.middleware,
               :doc "Allow decorating how plan functions are executed."}
              {:vars ({:ns pallet.node,
                       :name tag,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 186,
                       :var-type :fn,
                       :arglists ([node tag-name]
                                  [node tag-name default-value]),
                       :doc "Return the specified tag."}
                      {:ns pallet.node,
                       :name user,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 149,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Return the user for admin on the node."}
                      {:ns pallet.node,
                       :name stopped?,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 118,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Predicate to test if node is terminated."}
                      {:ns pallet.node,
                       :name tags,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 195,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Return the tags."}
                      {:ns pallet.node,
                       :name compute-service,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 131,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Return the service provider the node was provided by."}
                      {:ns pallet.node,
                       :name os-family,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 88,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Return a node's os-family, or nil if not available."}
                      {:ns pallet.node,
                       :name packager,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 137,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "The packager to use on the node"}
                      {:ns pallet.node,
                       :name running?,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 100,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Predicate to test if node is running."}
                      {:ns pallet.node,
                       :name taggable?,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 180,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Predicate to test the availability of tags."}
                      {:ns pallet.node,
                       :name Proxy,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 15,
                       :var-type :var}
                      {:ns pallet.node,
                       :name is-64bit?,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 70,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "64 Bit OS predicate"}
                      {:ns pallet.node,
                       :name tag!,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 201,
                       :var-type :fn,
                       :arglists ([node tag-name value]),
                       :doc "Set a value on the given tag-name."}
                      {:ns pallet.node,
                       :name ssh-port,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 51,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Extract the port from the node's user Metadata"}
                      {:ns pallet.node,
                       :name validate-node,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 41,
                       :var-type :fn,
                       :arglists ([obj]),
                       :doc "Predicate to test whether an object implements the Node protocol"}
                      {:ns pallet.node,
                       :name has-base-name?,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 206,
                       :var-type :fn,
                       :arglists ([node base-name]),
                       :doc "Predicate for the node name matching the specified base-name"}
                      {:ns pallet.node,
                       :name arch,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 76,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Node architecture"}
                      {:ns pallet.node,
                       :name hardware,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 155,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Return a map with `:cpus`, `:ram`, and `:disks` information. The\nram is reported in Mb. The `:cpus` is a sequence of maps, one for each\ncpu, containing the number of `:cores` on each. The `:disks` is a\nsequence of maps, containing a :size key for each drive, in Gb. Other\nkeys may be present."}
                      {:ns pallet.node,
                       :name primary-ip,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 58,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Returns the first public IP for the node."}
                      {:ns pallet.node,
                       :name hostname,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 82,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Return the node's hostname"}
                      {:ns pallet.node,
                       :name script-template,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 214,
                       :var-type :fn,
                       :arglists ([node])}
                      {:ns pallet.node,
                       :name suspended?,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 112,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Predicate to test if node is terminated."}
                      {:ns pallet.node,
                       :name os-version,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 94,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Return a node's os-version, or nil if not available."}
                      {:ns pallet.node,
                       :name terminated?,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 106,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Predicate to test if node is terminated."}
                      {:ns pallet.node,
                       :name proxy,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 165,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "A map with SSH proxy connection details."}
                      {:ns pallet.node,
                       :name node-address,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 171,
                       :var-type :fn,
                       :arglists ([node])}
                      {:ns pallet.node,
                       :name id,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 124,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Return the node's id."}
                      {:ns pallet.node,
                       :name private-ip,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 64,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Returns the first private IP for the node."}
                      {:ns pallet.node,
                       :name NodeValues,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 18,
                       :var-type :var}
                      {:ns pallet.node,
                       :name node?,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 46,
                       :var-type :fn,
                       :arglists ([obj]),
                       :doc "Predicate to test whether an object implements the Node protocol"}
                      {:ns pallet.node,
                       :name image-user,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 143,
                       :var-type :fn,
                       :arglists ([node]),
                       :doc "Return the user that is defined by the image."}
                      {:ns pallet.node,
                       :name Node,
                       :file "pallet/node.clj",
                       :column 1,
                       :line 37,
                       :var-type :var,
                       :doc "Schema for nodes"}),
               :ns-name pallet.node,
               :doc "Provider level API for nodes in pallet"}
              {:vars ({:ns pallet.phase,
                       :name lift-unfailed-targets-phase,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 144,
                       :var-type :fn,
                       :arglists ([session target-phase]),
                       :doc "Return a phase function that calls execute-target-phase on target-phase,\n  for just those targets that have no errors."}
                      {:ns pallet.phase,
                       :name TargetsState,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 92,
                       :var-type :var}
                      {:ns pallet.phase,
                       :name targets-state,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 106,
                       :var-type :fn,
                       :arglists ([{:keys [results
                                           new-targets
                                           old-targets]}]),
                       :doc "Return a state that is the set of successful targets."}
                      {:var-type :fn,
                       :ns pallet.phase,
                       :name parallel-phases,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 73,
                       :arglists ([fs init ch]),
                       :doc "Call functions in parallel, returning a combined result.  Each\n  function must take a single channel argument, to which it writes a\n  single rex-map.\n\n  `init` is an initial result map.\n\n## Function Signatures\n\n  - [clojure.lang.IFn] (maybe PhaseResult) WritePort -> ReadPort",
                       :sig [[[clojure.lang.IFn]
                              (maybe
                               {(optional-key :exception) java.lang.Throwable,
                                (optional-key :results) [{(optional-key
                                                           :action-results) [{(optional-key
                                                                               :error) Any,
                                                                              (optional-key
                                                                               :summary) (maybe
                                                                                          java.lang.String),
                                                                              Keyword Any}],
                                                          (optional-key
                                                           :return-value) Any,
                                                          (optional-key
                                                           :exception) java.lang.Exception}],
                                (optional-key :new-targets) [{Keyword Any}],
                                (optional-key :old-targets) [{Keyword Any}],
                                (optional-key :state) {Keyword Any}})
                              clojure.core.async.impl.protocols.WritePort
                              :-
                              clojure.core.async.impl.protocols.ReadPort]]}
                      {:ns pallet.phase,
                       :name destroy-nodes-phase,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 163,
                       :var-type :fn,
                       :arglists ([compute-service targets]),
                       :doc "Return a phase function that calls destroy-nodes on the non-failed\n  targets in results."}
                      {:ns pallet.phase,
                       :name partition-result-targets,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 96,
                       :var-type :fn,
                       :arglists ([results]),
                       :doc "Partition targets based on results.  Return a tuple with a set of\n  good targets and a set of failed targets."}
                      {:ns pallet.phase,
                       :name PhaseResult,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 30,
                       :var-type :var,
                       :doc "A phase result is the result of some set of operations."}
                      {:var-type :fn,
                       :ns pallet.phase,
                       :name series-phases,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 40,
                       :arglists ([fs init ch]),
                       :doc "Executes a sequence of phase steps.\n\n  A phase is a set of operations that are carried with a\n  synchronisation point after them.\n\n  Each step is a a function.  At each step, the function is called\n  with the current result map and a result channel.  The function must\n  write a single rex-map to the result channel.  The map may\n  contain :exception, :results, :new-targets, and :old-targets keys.\n\n  The results of each step are combined and written to the output\n  channel, ch, as a rex-map.\n\n  `init` is an initial result map.\n\n## Function Signatures\n\n  - [clojure.lang.IFn] (maybe PhaseResult) WritePort -> ReadPort",
                       :sig [[[clojure.lang.IFn]
                              (maybe
                               {(optional-key :exception) java.lang.Throwable,
                                (optional-key :results) [{(optional-key
                                                           :action-results) [{(optional-key
                                                                               :error) Any,
                                                                              (optional-key
                                                                               :summary) (maybe
                                                                                          java.lang.String),
                                                                              Keyword Any}],
                                                          (optional-key
                                                           :return-value) Any,
                                                          (optional-key
                                                           :exception) java.lang.Exception}],
                                (optional-key :new-targets) [{Keyword Any}],
                                (optional-key :old-targets) [{Keyword Any}],
                                (optional-key :state) {Keyword Any}})
                              clojure.core.async.impl.protocols.WritePort
                              :-
                              clojure.core.async.impl.protocols.ReadPort]]}
                      {:var-type :fn,
                       :ns pallet.phase,
                       :name lift-when-no-errors-phase,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 134,
                       :arglists ([session target-phase]),
                       :doc "Return a function that will execute the target-phase if there\n  are no errors in previous results.\n\n## Function Signatures\n\n  - BaseSession TargetPhase -> Any",
                       :sig [[{:execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                 (optional-key
                                                  :recorder) pallet.core.recorder.protocols.Record,
                                                 (optional-key
                                                  :action-options) {Keyword Any},
                                                 (optional-key :user) Any,
                                                 (optional-key
                                                  :environment) Any,
                                                 (optional-key
                                                  :extension) {Keyword Any},
                                                 (optional-key
                                                  :record-all) {Keyword java.lang.Boolean},
                                                 (optional-key
                                                  :event-fn) Any},
                               (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                               :type (eq :pallet.session/session)}
                              {:result-id {Any Any},
                               :target-plans [{:target Any,
                                               :plan-fn (=>
                                                         clojure.core.async.impl.protocols.WritePort
                                                         {:target {Keyword Any},
                                                          :execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                                            (optional-key
                                                                             :recorder) pallet.core.recorder.protocols.Record,
                                                                            (optional-key
                                                                             :action-options) {Keyword Any},
                                                                            (optional-key
                                                                             :user) Any,
                                                                            (optional-key
                                                                             :environment) Any,
                                                                            (optional-key
                                                                             :extension) {Keyword Any},
                                                                            (optional-key
                                                                             :record-all) {Keyword java.lang.Boolean},
                                                                            (optional-key
                                                                             :event-fn) Any},
                                                          (optional-key
                                                           :plan-state) pallet.core.plan_state.protocols.StateGet,
                                                          :type (eq
                                                                 :pallet.session/session)})}]}
                              :-
                              Any]]}
                      {:var-type :fn,
                       :ns pallet.phase,
                       :name remove-failed-targets,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 120,
                       :arglists ([target-phase targets]),
                       :doc "Remove target plans from `target-phase` if they are for one of `targets`.\n\n## Function Signatures\n\n  - TargetPhase (maybe #{Target}) -> TargetPhase",
                       :sig [[{:result-id {Any Any},
                               :target-plans [{:target Any,
                                               :plan-fn (=>
                                                         clojure.core.async.impl.protocols.WritePort
                                                         {:target {Keyword Any},
                                                          :execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                                            (optional-key
                                                                             :recorder) pallet.core.recorder.protocols.Record,
                                                                            (optional-key
                                                                             :action-options) {Keyword Any},
                                                                            (optional-key
                                                                             :user) Any,
                                                                            (optional-key
                                                                             :environment) Any,
                                                                            (optional-key
                                                                             :extension) {Keyword Any},
                                                                            (optional-key
                                                                             :record-all) {Keyword java.lang.Boolean},
                                                                            (optional-key
                                                                             :event-fn) Any},
                                                          (optional-key
                                                           :plan-state) pallet.core.plan_state.protocols.StateGet,
                                                          :type (eq
                                                                 :pallet.session/session)})}]}
                              (maybe #{{Keyword Any}})
                              :-
                              {:result-id {Any Any},
                               :target-plans [{:target Any,
                                               :plan-fn (=>
                                                         clojure.core.async.impl.protocols.WritePort
                                                         {:target {Keyword Any},
                                                          :execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                                            (optional-key
                                                                             :recorder) pallet.core.recorder.protocols.Record,
                                                                            (optional-key
                                                                             :action-options) {Keyword Any},
                                                                            (optional-key
                                                                             :user) Any,
                                                                            (optional-key
                                                                             :environment) Any,
                                                                            (optional-key
                                                                             :extension) {Keyword Any},
                                                                            (optional-key
                                                                             :record-all) {Keyword java.lang.Boolean},
                                                                            (optional-key
                                                                             :event-fn) Any},
                                                          (optional-key
                                                           :plan-state) pallet.core.plan_state.protocols.StateGet,
                                                          :type (eq
                                                                 :pallet.session/session)})}]}]]}
                      {:ns pallet.phase,
                       :name create-nodes-phase,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 157,
                       :var-type :fn,
                       :arglists ([compute-service
                                   node-spec
                                   user
                                   count
                                   base-name])}
                      {:ns pallet.phase,
                       :name lift-phase,
                       :file "pallet/phase.clj",
                       :column 1,
                       :line 127,
                       :var-type :fn,
                       :arglists ([session target-phase]),
                       :doc "Return a function that will execute the target-phase when called\n  with results and a channel argument."}),
               :ns-name pallet.phase,
               :doc "API for running phases of plan functions."}
              {:vars ({:ns pallet.phase-middleware,
                       :name partition-target-plans,
                       :file "pallet/phase_middleware.clj",
                       :column 1,
                       :line 11,
                       :var-type :fn,
                       :arglists ([handler partition-f]),
                       :doc "Return a phase middleware to partition target-plans using the\n  specified function, partition-f.  The partition-f function takes a\n  sequence of target, plan-fn tuples and returns a sequence of target,\n  plan-fn tuple sequences."}
                      {:ns pallet.phase-middleware,
                       :name post-phase,
                       :file "pallet/phase_middleware.clj",
                       :column 1,
                       :line 36,
                       :var-type :fn,
                       :arglists ([handler post-phase-f]),
                       :doc "Return a phase middleware that will be invoked on the result of a\n  phase lift.  The function is for side effects only.  It is called with\n  session, targets, and results."}),
               :ns-name pallet.phase-middleware,
               :doc "Middleware that is usable at the phase level.\n  The middleware must execute asynchronously, returning the\n  channel for it's async go block.  It must write a result to\n  it's channel argument."}
              {:vars ({:ns pallet.plan,
                       :name plan-context,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 315,
                       :macro true,
                       :var-type :macro,
                       :arglists ([context-name & body]),
                       :doc "Defines a block with a context that is automatically added."}
                      {:ns pallet.plan,
                       :name AdornedTargetResult,
                       :file "pallet/plan.clj",
                       :column 1,
                       :internal true,
                       :line 83,
                       :var-type :var}
                      {:ns pallet.plan,
                       :name PlanTargetResult,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 60,
                       :var-type :var,
                       :doc "The result of a plan function on a single target, labeled by target."}
                      {:ns pallet.plan,
                       :name ActionResult,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 47,
                       :var-type :var,
                       :doc "The result of a single action.  The `:error` key is reserved for\n  reporting failed actions (domain errors)."}
                      {:ns pallet.plan,
                       :name check-plan-arguments,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 346,
                       :var-type :fn,
                       :arglists ([{:keys [name], :as defn-map}]),
                       :doc "Check arguments for at least one (session) argument, and add a\n  runtime check that it is passed a TargetSession"}
                      {:ns pallet.plan,
                       :name AdornedPlanResult,
                       :file "pallet/plan.clj",
                       :column 1,
                       :internal true,
                       :line 80,
                       :var-type :var}
                      {:var-type :multi-method,
                       :ns pallet.plan,
                       :name execute-plan*,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 126,
                       :doc "Execute a plan function. Does not call any plan middleware.\n\n  By default we execute the plan-fn in a context where actions are\n  allowed.\n\n  Suitable for use as a plan middleware handler function.  Should not\n  be called directly.  This is an extension point for pallet, that\n  could be used to define a new target type to execute against."}
                      {:var-type :fn,
                       :ns pallet.plan,
                       :name execute-target-phase,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 254,
                       :arglists ([session
                                   {:keys [result-id target-plans],
                                    :as target-phase}
                                   ch]),
                       :doc "Execute plans, merging the result-id map into the result of each\n  plan-fn.  Write a result-exception map to the channel, ch.\n\n## Function Signatures\n\n  - BaseSession TargetPhase WritePort -> ReadPort",
                       :sig [[{:execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                 (optional-key
                                                  :recorder) pallet.core.recorder.protocols.Record,
                                                 (optional-key
                                                  :action-options) {Keyword Any},
                                                 (optional-key :user) Any,
                                                 (optional-key
                                                  :environment) Any,
                                                 (optional-key
                                                  :extension) {Keyword Any},
                                                 (optional-key
                                                  :record-all) {Keyword java.lang.Boolean},
                                                 (optional-key
                                                  :event-fn) Any},
                               (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                               :type (eq :pallet.session/session)}
                              {:result-id {Any Any},
                               :target-plans [{:target Any,
                                               :plan-fn (=>
                                                         clojure.core.async.impl.protocols.WritePort
                                                         {:target {Keyword Any},
                                                          :execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                                            (optional-key
                                                                             :recorder) pallet.core.recorder.protocols.Record,
                                                                            (optional-key
                                                                             :action-options) {Keyword Any},
                                                                            (optional-key
                                                                             :user) Any,
                                                                            (optional-key
                                                                             :environment) Any,
                                                                            (optional-key
                                                                             :extension) {Keyword Any},
                                                                            (optional-key
                                                                             :record-all) {Keyword java.lang.Boolean},
                                                                            (optional-key
                                                                             :event-fn) Any},
                                                          (optional-key
                                                           :plan-state) pallet.core.plan_state.protocols.StateGet,
                                                          :type (eq
                                                                 :pallet.session/session)})}]}
                              clojure.core.async.impl.protocols.WritePort
                              :-
                              clojure.core.async.impl.protocols.ReadPort]]}
                      {:var-type :fn,
                       :ns pallet.plan,
                       :name execute-plans*,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 205,
                       :arglists ([session target-plans ch]),
                       :doc "Using the executor in `session`, execute phase on all targets.\n  The targets are executed in parallel, each in its own thread.  A\n  single [result, exception] tuple will be written to the channel ch,\n  where result is a sequence of results for each target, and exception\n  is a composite exception of any thrown exceptions.\n\n  Does not call phase middleware.  Does call plan middleware.  Suitable\n  as the handler for a phase-middleware.\n\n## Function Signatures\n\n  - BaseSession [TargetPlan] WritePort -> ReadPort",
                       :sig [[{:execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                 (optional-key
                                                  :recorder) pallet.core.recorder.protocols.Record,
                                                 (optional-key
                                                  :action-options) {Keyword Any},
                                                 (optional-key :user) Any,
                                                 (optional-key
                                                  :environment) Any,
                                                 (optional-key
                                                  :extension) {Keyword Any},
                                                 (optional-key
                                                  :record-all) {Keyword java.lang.Boolean},
                                                 (optional-key
                                                  :event-fn) Any},
                               (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                               :type (eq :pallet.session/session)}
                              [{:target Any,
                                :plan-fn (=>
                                          clojure.core.async.impl.protocols.WritePort
                                          {:target {Keyword Any},
                                           :execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                             (optional-key
                                                              :recorder) pallet.core.recorder.protocols.Record,
                                                             (optional-key
                                                              :action-options) {Keyword Any},
                                                             (optional-key
                                                              :user) Any,
                                                             (optional-key
                                                              :environment) Any,
                                                             (optional-key
                                                              :extension) {Keyword Any},
                                                             (optional-key
                                                              :record-all) {Keyword java.lang.Boolean},
                                                             (optional-key
                                                              :event-fn) Any},
                                           (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                                           :type (eq
                                                  :pallet.session/session)})}]
                              clojure.core.async.impl.protocols.WritePort
                              :-
                              clojure.core.async.impl.protocols.ReadPort]]}
                      {:ns pallet.plan,
                       :name Target,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 42,
                       :var-type :var,
                       :doc "Defines a target for execution.  This is usually a node or a spec,\n  but is open for extension."}
                      {:var-type :fn,
                       :ns pallet.plan,
                       :name errors,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 286,
                       :arglists ([results]),
                       :doc "Return a sequence of errors for a sequence of result maps.\n   Each element in the sequence represents a failed action, and is a\n   map, with :target, :error, :context and all the return value keys\n   for the return value of the failed action.\n\n## Function Signatures\n\n  - [AdornedTargetResult] -> [AdornedTargetResult]",
                       :sig [[[{Keyword Any,
                                :target {Keyword Any},
                                (optional-key :action-results) [{(optional-key
                                                                  :error) Any,
                                                                 (optional-key
                                                                  :summary) (maybe
                                                                             java.lang.String),
                                                                 Keyword Any}],
                                (optional-key :return-value) Any,
                                (optional-key :exception) java.lang.Exception}]
                              :-
                              [{Keyword Any,
                                :target {Keyword Any},
                                (optional-key :action-results) [{(optional-key
                                                                  :error) Any,
                                                                 (optional-key
                                                                  :summary) (maybe
                                                                             java.lang.String),
                                                                 Keyword Any}],
                                (optional-key :return-value) Any,
                                (optional-key :exception) java.lang.Exception}]]]}
                      {:var-type :fn,
                       :ns pallet.plan,
                       :name error-exceptions,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 295,
                       :arglists ([results]),
                       :doc "Return a sequence of exceptions from a sequence of results.\n\n## Function Signatures\n\n  - [AdornedTargetResult] -> [Throwable]",
                       :sig [[[{Keyword Any,
                                :target {Keyword Any},
                                (optional-key :action-results) [{(optional-key
                                                                  :error) Any,
                                                                 (optional-key
                                                                  :summary) (maybe
                                                                             java.lang.String),
                                                                 Keyword Any}],
                                (optional-key :return-value) Any,
                                (optional-key :exception) java.lang.Exception}]
                              :-
                              [java.lang.Throwable]]]}
                      {:api :plan,
                       :ns pallet.plan,
                       :name defmulti-every,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 433,
                       :macro true,
                       :var-type :macro,
                       :arglists ([name
                                   docstring?
                                   attr-map?
                                   dispatch-fns
                                   {:keys [selector], :as options}]),
                       :doc "Declare a multimethod where method dispatch values have to match\n  all of a sequence of predicates.  Each predicate will be called with the\n  dispatch value, and the argument vector.  When multiple dispatch methods\n  match, the :selector option will be called on the sequence of matching\n  dispatches, and should return the selected match.  :selector defaults\n  to `first`.\n\n  Use defmethod-plan to add methods to defmulti-every."}
                      {:var-type :fn,
                       :ns pallet.plan,
                       :name throw-errors,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 301,
                       :arglists ([results]),
                       :doc "Throw an exception if there is any exception in results.\n\n## Function Signatures\n\n  - [AdornedTargetResult] -> (eq nil)",
                       :sig [[[{Keyword Any,
                                :target {Keyword Any},
                                (optional-key :action-results) [{(optional-key
                                                                  :error) Any,
                                                                 (optional-key
                                                                  :summary) (maybe
                                                                             java.lang.String),
                                                                 Keyword Any}],
                                (optional-key :return-value) Any,
                                (optional-key :exception) java.lang.Exception}]
                              :-
                              (eq nil)]]}
                      {:ns pallet.plan,
                       :name plan-fn,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 368,
                       :macro true,
                       :var-type :macro,
                       :arglists [[& sigs]],
                       :doc "Create a plan function from a sequence of plan function invocations.\n\n   eg. (plan-fn [session]\n         (file session \"/some-file\")\n         (file session \"/other-file\"))\n\n   This generates a new plan function, and adds code to verify the state\n   around each plan function call.\n\n  The plan-fn can be optionally named, as for `fn`."}
                      {:ns pallet.plan,
                       :name add-plan-context,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 331,
                       :var-type :fn,
                       :arglists ([{:keys [name], :as defn-map}]),
                       :doc "Adds a plan-context aroiund the body of the function."}
                      {:var-type :fn,
                       :ns pallet.plan,
                       :name plan-errors,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 274,
                       :arglists ([plan-result]),
                       :doc "Return a plan result containing just the errors in the action results\n  and any exception information.  If there are no errors, return nil.\n\n## Function Signatures\n\n  - (either AdornedPlanResult AdornedTargetResult) -> (maybe (either AdornedPlanResult AdornedTargetResult))",
                       :sig [[(either
                               {Keyword Any,
                                (optional-key :action-results) [{(optional-key
                                                                  :error) Any,
                                                                 (optional-key
                                                                  :summary) (maybe
                                                                             java.lang.String),
                                                                 Keyword Any}],
                                (optional-key :return-value) Any,
                                (optional-key :exception) java.lang.Exception}
                               {Keyword Any,
                                :target {Keyword Any},
                                (optional-key :action-results) [{(optional-key
                                                                  :error) Any,
                                                                 (optional-key
                                                                  :summary) (maybe
                                                                             java.lang.String),
                                                                 Keyword Any}],
                                (optional-key :return-value) Any,
                                (optional-key :exception) java.lang.Exception})
                              :-
                              (maybe
                               (either
                                {Keyword Any,
                                 (optional-key :action-results) [{(optional-key
                                                                   :error) Any,
                                                                  (optional-key
                                                                   :summary) (maybe
                                                                              java.lang.String),
                                                                  Keyword Any}],
                                 (optional-key :return-value) Any,
                                 (optional-key :exception) java.lang.Exception}
                                {Keyword Any,
                                 :target {Keyword Any},
                                 (optional-key :action-results) [{(optional-key
                                                                   :error) Any,
                                                                  (optional-key
                                                                   :summary) (maybe
                                                                              java.lang.String),
                                                                  Keyword Any}],
                                 (optional-key :return-value) Any,
                                 (optional-key :exception) java.lang.Exception}))]]}
                      {:ns pallet.plan,
                       :name PlanFn,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 33,
                       :var-type :var}
                      {:ns pallet.plan,
                       :name TargetPhase,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 75,
                       :var-type :var,
                       :doc "A sequence of target plans, with an id for identifying the results."}
                      {:var-type :fn,
                       :ns pallet.plan,
                       :name execute-plans,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 234,
                       :arglists ([session target-plans ch]),
                       :doc "Execute plan functions on targets.  Write a result tuple to the\n  channel, ch.  Targets are grouped by phase-middleware, and phase\n  middleware is called.  plans are executed in parallel.\n  `target-plans` is a sequence of target, plan-fn tuples.\n\n## Function Signatures\n\n  - BaseSession [TargetPlan] WritePort -> ReadPort",
                       :sig [[{:execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                 (optional-key
                                                  :recorder) pallet.core.recorder.protocols.Record,
                                                 (optional-key
                                                  :action-options) {Keyword Any},
                                                 (optional-key :user) Any,
                                                 (optional-key
                                                  :environment) Any,
                                                 (optional-key
                                                  :extension) {Keyword Any},
                                                 (optional-key
                                                  :record-all) {Keyword java.lang.Boolean},
                                                 (optional-key
                                                  :event-fn) Any},
                               (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                               :type (eq :pallet.session/session)}
                              [{:target Any,
                                :plan-fn (=>
                                          clojure.core.async.impl.protocols.WritePort
                                          {:target {Keyword Any},
                                           :execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                             (optional-key
                                                              :recorder) pallet.core.recorder.protocols.Record,
                                                             (optional-key
                                                              :action-options) {Keyword Any},
                                                             (optional-key
                                                              :user) Any,
                                                             (optional-key
                                                              :environment) Any,
                                                             (optional-key
                                                              :extension) {Keyword Any},
                                                             (optional-key
                                                              :record-all) {Keyword java.lang.Boolean},
                                                             (optional-key
                                                              :event-fn) Any},
                                           (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                                           :type (eq
                                                  :pallet.session/session)})}]
                              clojure.core.async.impl.protocols.WritePort
                              :-
                              clojure.core.async.impl.protocols.ReadPort]]}
                      {:api :plan,
                       :ns pallet.plan,
                       :name defmethod-every,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 465,
                       :macro true,
                       :var-type :macro,
                       :arglists ([multifn dispatch-val args & body])}
                      {:ns pallet.plan,
                       :name TargetPlan,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 71,
                       :var-type :var}
                      {:api :plan,
                       :ns pallet.plan,
                       :name defmethod-plan,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 414,
                       :macro true,
                       :var-type :macro,
                       :arglists ([multifn dispatch-val args & body])}
                      {:ns pallet.plan,
                       :name TargetResult,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 65,
                       :var-type :var}
                      {:ns pallet.plan,
                       :name PlanResult,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 54,
                       :var-type :var,
                       :doc "The result of a plan function on a single target."}
                      {:private true,
                       :ns pallet.plan,
                       :name final-fn-sym?,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 321,
                       :var-type :fn,
                       :arglists ([sym form]),
                       :doc "Predicate to match the final function symbol in a form."}
                      {:ns pallet.plan,
                       :name defplan,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 381,
                       :macro true,
                       :var-type :macro,
                       :arglists [[name
                                   doc-string?
                                   attr-map?
                                   [params*]
                                   prepost-map?
                                   body]
                                  [name
                                   doc-string?
                                   attr-map?
                                   ([params*] prepost-map? body)
                                   +
                                   attr-map?]],
                       :doc "Define a plan function. Assumes the first argument is a session map.\n  Adds a plan context around the function body.  Adds checking for at\n  least one (session) argument."}
                      {:ns pallet.plan,
                       :name Action,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 35,
                       :var-type :var}
                      {:ns pallet.plan,
                       :name execute-action,
                       :file "pallet/plan.clj",
                       :column 1,
                       :internal true,
                       :sig [[{:target {Keyword Any},
                               :execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                 (optional-key
                                                  :recorder) pallet.core.recorder.protocols.Record,
                                                 (optional-key
                                                  :action-options) {Keyword Any},
                                                 (optional-key :user) Any,
                                                 (optional-key
                                                  :environment) Any,
                                                 (optional-key
                                                  :extension) {Keyword Any},
                                                 (optional-key
                                                  :record-all) {Keyword java.lang.Boolean},
                                                 (optional-key
                                                  :event-fn) Any},
                               (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                               :type (eq :pallet.session/session)}
                              {:action {:action-symbol clojure.lang.Symbol,
                                        :impls clojure.lang.Atom,
                                        (optional-key :options) {Keyword Any}},
                               :args [Any],
                               (optional-key :options) {Keyword Any}}
                              :-
                              {(optional-key :error) Any,
                               (optional-key :summary) (maybe
                                                        java.lang.String),
                               Keyword Any}]],
                       :line 87,
                       :var-type :fn,
                       :arglists ([{:keys [target], :as session}
                                   action]),
                       :doc "Execute an action map within the context of the current session.\n  If the action throws an exception, add it to the result, and throw a\n  wrapped exception containing the results.  Throwing the exception will\n  cease execution of the plan function (unless explicitly handled).\n\n## Function Signatures\n\n  - TargetSession Action -> ActionResult"}
                      {:api :plan,
                       :ns pallet.plan,
                       :name defmulti-plan,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 388,
                       :macro true,
                       :var-type :macro,
                       :arglists ([name
                                   docstring?
                                   attr-map?
                                   dispatch-fn
                                   {:keys [hierarchy], :as options}]),
                       :doc "Declare a multimethod for plan functions.  Does not have defonce semantics.\n  Methods will automatically be wrapped in a plan-context."}
                      {:var-type :fn,
                       :ns pallet.plan,
                       :name execute-plan,
                       :file "pallet/plan.clj",
                       :column 1,
                       :line 190,
                       :arglists ([session target plan-fn]),
                       :doc "Using the session, execute plan-fn on target. Uses any plan\n  middleware defined on the plan-fn.  Results are recorded by any\n  recorder in the session, as well as being returned.\n\n## Function Signatures\n\n  - BaseSession Target PlanFn -> (maybe PlanTargetResult)",
                       :sig [[{:execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                 (optional-key
                                                  :recorder) pallet.core.recorder.protocols.Record,
                                                 (optional-key
                                                  :action-options) {Keyword Any},
                                                 (optional-key :user) Any,
                                                 (optional-key
                                                  :environment) Any,
                                                 (optional-key
                                                  :extension) {Keyword Any},
                                                 (optional-key
                                                  :record-all) {Keyword java.lang.Boolean},
                                                 (optional-key
                                                  :event-fn) Any},
                               (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                               :type (eq :pallet.session/session)}
                              {Keyword Any}
                              (=>
                               Any
                               {:execution-state {:executor pallet.core.executor.protocols.ActionExecutor,
                                                  (optional-key
                                                   :recorder) pallet.core.recorder.protocols.Record,
                                                  (optional-key
                                                   :action-options) {Keyword Any},
                                                  (optional-key :user) Any,
                                                  (optional-key
                                                   :environment) Any,
                                                  (optional-key
                                                   :extension) {Keyword Any},
                                                  (optional-key
                                                   :record-all) {Keyword java.lang.Boolean},
                                                  (optional-key
                                                   :event-fn) Any},
                                (optional-key :plan-state) pallet.core.plan_state.protocols.StateGet,
                                :type (eq :pallet.session/session)}
                               Any)
                              :-
                              (maybe
                               {:target {Keyword Any},
                                (optional-key :action-results) [{(optional-key
                                                                  :error) Any,
                                                                 (optional-key
                                                                  :summary) (maybe
                                                                             java.lang.String),
                                                                 Keyword Any}],
                                (optional-key :return-value) Any,
                                (optional-key :exception) java.lang.Exception})]]}),
               :ns-name pallet.plan,
               :doc "API for execution of pallet plan functions."}
              {:vars ({:ns pallet.plugin,
                       :name load-plugins,
                       :file "pallet/plugin.clj",
                       :column 1,
                       :line 17,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Load pallet plugins"}
                      {:ns pallet.plugin,
                       :name load-plugins*,
                       :file "pallet/plugin.clj",
                       :column 1,
                       :line 5,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Load pallet plugins"}
                      {:ns pallet.plugin,
                       :name plugin-namespaces,
                       :file "pallet/plugin.clj",
                       :column 1,
                       :line 15,
                       :var-type :var}),
               :ns-name pallet.plugin}
              {:vars ({:ns pallet.script.lib,
                       :name group-seq->string,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 477,
                       :var-type :fn,
                       :arglists ([groups])}
                      {:ns pallet.script.lib,
                       :name selinux-bool,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 957,
                       :var-type :fn,
                       :arglists ([flag value & {:keys [persist]}]),
                       :doc "Set the selinux boolean value"}
                      {:ns pallet.script.lib,
                       :name upgrade-package,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 584,
                       :var-type :fn,
                       :arglists ([name & options]),
                       :doc "Upgrade the specified package."}
                      {:ns pallet.script.lib,
                       :name install-package,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 580,
                       :var-type :fn,
                       :arglists ([name & options]),
                       :doc "Install the specified package."}
                      {:ns pallet.script.lib,
                       :name remove-user,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 463,
                       :var-type :fn,
                       :arglists ([name options])}
                      {:ns pallet.script.lib,
                       :name md5sum,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 245,
                       :var-type :fn,
                       :arglists ([file & {:as options}])}
                      {:ns pallet.script.lib,
                       :name sudo,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 968,
                       :var-type :fn,
                       :arglists ([& {:keys [no-prompt user stdin]}])}
                      {:ns pallet.script.lib,
                       :name os-version-name,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 416,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name dirname,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 119,
                       :var-type :fn,
                       :arglists ([path])}
                      {:ns pallet.script.lib,
                       :name path-group,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 133,
                       :var-type :fn,
                       :arglists ([path]),
                       :doc "Return the group of the given path"}
                      {:ns pallet.script.lib,
                       :name tmp-dir,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 324,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name system-environment,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 911,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name pkg-log-root,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 895,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name etc-init,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 880,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name ubuntu-version,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 447,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name debian-options,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 781,
                       :var-type :fn,
                       :arglists ([options])}
                      {:ns pallet.script.lib,
                       :name rm,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 64,
                       :var-type :fn,
                       :arglists ([file & {:keys [recursive force]}])}
                      {:ns pallet.script.lib,
                       :name diff,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 177,
                       :var-type :fn,
                       :arglists ([file1 file2 & {:keys [unified]}])}
                      {:ns pallet.script.lib,
                       :name backup-option,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 285,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name group-exists?,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 469,
                       :var-type :fn,
                       :arglists ([name])}
                      {:ns pallet.script.lib,
                       :name cut,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 182,
                       :var-type :fn,
                       :arglists ([file & {:keys [fields delimiter]}])}
                      {:ns pallet.script.lib,
                       :name modify-group,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 470,
                       :var-type :fn,
                       :arglists ([name options])}
                      {:ns pallet.script.lib,
                       :name create-user,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 462,
                       :var-type :fn,
                       :arglists ([name options])}
                      {:ns pallet.script.lib,
                       :name basename,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 114,
                       :var-type :fn,
                       :arglists ([path])}
                      {:ns pallet.script.lib,
                       :name etc-default,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 848,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name state-root,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 860,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name debconf-set-selections,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 759,
                       :var-type :fn,
                       :arglists ([& selections])}
                      {:ns pallet.script.lib,
                       :name chgrp,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 196,
                       :var-type :fn,
                       :arglists ([group file & {:as options}])}
                      {:ns pallet.script.lib,
                       :name download-request,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 315,
                       :var-type :fn,
                       :arglists ([path request])}
                      {:ns pallet.script.lib,
                       :name cat,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 167,
                       :var-type :fn,
                       :arglists ([pattern])}
                      {:ns pallet.script.lib,
                       :name file-changed,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 923,
                       :var-type :fn,
                       :arglists ([path])}
                      {:ns pallet.script.lib,
                       :name pid-root,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 864,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name make-temp-dir,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 401,
                       :var-type :fn,
                       :arglists ([pattern & {:as options}]),
                       :doc "Create a temporary directory"}
                      {:ns pallet.script.lib,
                       :name config-root,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 872,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name debian-version,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 439,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name mv,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 70,
                       :var-type :fn,
                       :arglists ([source
                                   destination
                                   &
                                   {:keys [force backup]}])}
                      {:ns pallet.script.lib,
                       :name wait-while,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 1007,
                       :var-type :fn,
                       :arglists ([test-expr
                                   standoff
                                   max-retries
                                   waiting-msg
                                   failed-msg]),
                       :doc "Returns a script expression that waits while test-expr is successful, using\na constant standoff (in seconds) and max-retries."}
                      {:ns pallet.script.lib,
                       :name heredoc-in,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 374,
                       :var-type :fn,
                       :arglists ([cmd content {:keys [literal]}])}
                      {:ns pallet.script.lib,
                       :name translate-options,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 11,
                       :var-type :fn,
                       :arglists ([options translations])}
                      {:ns pallet.script.lib,
                       :name remove-group,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 472,
                       :var-type :fn,
                       :arglists ([name options])}
                      {:ns pallet.script.lib,
                       :name current-user,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 467,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name upgrade-all-packages,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 576,
                       :var-type :fn,
                       :arglists ([& options]),
                       :doc "Upgrade the all installed package."}
                      {:ns pallet.script.lib,
                       :name mkdir,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 392,
                       :var-type :fn,
                       :arglists ([directory
                                   &
                                   {:keys [path verbose mode]}]),
                       :doc "Create the specified directory"}
                      {:ns pallet.script.lib,
                       :name pkg-pid-root,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 899,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name exit,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([value])}
                      {:ns pallet.script.lib,
                       :name pkg-config-root,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 903,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name path-owner,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 124,
                       :var-type :fn,
                       :arglists ([path]),
                       :doc "Return the owner of the given path"}
                      {:ns pallet.script.lib,
                       :name set-flag-value,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 935,
                       :var-type :fn,
                       :arglists ([flag-name flag-value])}
                      {:ns pallet.script.lib,
                       :name set-flag,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 931,
                       :var-type :fn,
                       :arglists ([flag-name])}
                      {:ns pallet.script.lib,
                       :name user-exists?,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 459,
                       :var-type :fn,
                       :arglists ([name])}
                      {:ns pallet.script.lib,
                       :name ln,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 101,
                       :var-type :fn,
                       :arglists ([source
                                   destination
                                   &
                                   {:keys [force symbolic no-deref]}])}
                      {:ns pallet.script.lib,
                       :name sed-file,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 208,
                       :var-type :fn,
                       :arglists ([file expr-map options])}
                      {:ns pallet.script.lib,
                       :name modify-user,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 461,
                       :var-type :fn,
                       :arglists ([name options])}
                      {:ns pallet.script.lib,
                       :name package-manager-non-interactive,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 765,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name sed-ext,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 241,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name user-default-group,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 151,
                       :var-type :fn,
                       :arglists ([user]),
                       :doc "Return the user's default group"}
                      {:ns pallet.script.lib,
                       :name unlock-user,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 465,
                       :var-type :fn,
                       :arglists ([name])}
                      {:ns pallet.script.lib,
                       :name pkg-etc-default,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 891,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name file,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 835,
                       :var-type :fn,
                       :arglists ([& args])}
                      {:ns pallet.script.lib,
                       :name purge-package,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 593,
                       :var-type :fn,
                       :arglists ([name & options]),
                       :doc "Uninstall the specified package, removing the configuration files if\n   possible."}
                      {:ns pallet.script.lib,
                       :name user-home,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 466,
                       :var-type :fn,
                       :arglists ([username])}
                      {:ns pallet.script.lib,
                       :name create-group,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 471,
                       :var-type :fn,
                       :arglists ([name options])}
                      {:ns pallet.script.lib,
                       :name debian-configure-option-names,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 778,
                       :var-type :var}
                      {:ns pallet.script.lib,
                       :name arch,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 451,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name bash,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 984,
                       :var-type :fn,
                       :arglists ([& {:keys [login]}]),
                       :doc "Call bash"}
                      {:ns pallet.script.lib,
                       :name lock-user,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 464,
                       :var-type :fn,
                       :arglists ([name])}
                      {:ns pallet.script.lib,
                       :name selinux-file-type,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 945,
                       :var-type :fn,
                       :arglists ([path type]),
                       :doc "Set the selinux file type"}
                      {:ns pallet.script.lib,
                       :name chmod,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 200,
                       :var-type :fn,
                       :arglists ([mode file & {:as options}])}
                      {:ns pallet.script.lib,
                       :name remove-package,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 588,
                       :var-type :fn,
                       :arglists ([name & options]),
                       :doc "Uninstall the specified package, leaving the configuration files if\n   possible."}
                      {:ns pallet.script.lib,
                       :name source,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 29,
                       :var-type :fn,
                       :arglists ([path])}
                      {:ns pallet.script.lib,
                       :name download-file,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 291,
                       :var-type :fn,
                       :arglists ([url
                                   path
                                   &
                                   {:keys [proxy insecure]}])}
                      {:ns pallet.script.lib,
                       :name env,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 999,
                       :var-type :fn,
                       :arglists ([& {:keys [vars]}]),
                       :doc "Setup an environment for another cmd.  Vars is a map of name and value\n  pairs."}
                      {:ns pallet.script.lib,
                       :name flag?,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 939,
                       :var-type :fn,
                       :arglists ([path])}
                      {:ns pallet.script.lib,
                       :name hostname,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 423,
                       :var-type :fn,
                       :arglists ([& options])}
                      {:ns pallet.script.lib,
                       :name export,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 25,
                       :var-type :fn,
                       :arglists ([name value])}
                      {:ns pallet.script.lib,
                       :name pkg-sbin,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 907,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name nameservers,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 434,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name ls,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 158,
                       :var-type :fn,
                       :arglists ([pattern
                                   &
                                   {:keys [sort-by-time
                                           sort-by-size
                                           reverse]}])}
                      {:ns pallet.script.lib,
                       :name configure-service,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 775,
                       :var-type :fn,
                       :arglists ([name action options])}
                      {:ns pallet.script.lib,
                       :name log-root,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 856,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name make-temp-file,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 336,
                       :var-type :fn,
                       :arglists ([pattern & {:keys [tmpdir]}])}
                      {:ns pallet.script.lib,
                       :name cp,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 86,
                       :var-type :fn,
                       :arglists ([source
                                   destination
                                   &
                                   {:keys [force backup preserve]}])}
                      {:ns pallet.script.lib,
                       :name normalise-md5,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 251,
                       :var-type :fn,
                       :arglists ([file]),
                       :doc "Normalise an md5 sum file to contain the base filename"}
                      {:ns pallet.script.lib,
                       :name xargs,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 37,
                       :var-type :fn,
                       :arglists ([script])}
                      {:ns pallet.script.lib,
                       :name md5sum-verify,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 262,
                       :var-type :fn,
                       :arglists ([file & {:as options}])}
                      {:ns pallet.script.lib,
                       :name etc-hosts,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 876,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name canonical-path,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 52,
                       :var-type :fn,
                       :arglists ([path])}
                      {:ns pallet.script.lib,
                       :name alias,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 33,
                       :var-type :fn,
                       :arglists ([name value])}
                      {:ns pallet.script.lib,
                       :name path-mode,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 142,
                       :var-type :fn,
                       :arglists ([path]),
                       :doc "Return the mode of the given path"}
                      {:ns pallet.script.lib,
                       :name has-command?,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 47,
                       :var-type :fn,
                       :arglists ([arg]),
                       :doc "Check whether the specified command is on the path"}
                      {:private true,
                       :ns pallet.script.lib,
                       :name chkconfig-levels,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 813,
                       :var-type :fn,
                       :arglists ([options])}
                      {:ns pallet.script.lib,
                       :name which,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 42,
                       :var-type :fn,
                       :arglists ([arg])}
                      {:ns pallet.script.lib,
                       :name tail,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 172,
                       :var-type :fn,
                       :arglists ([pattern & {:keys [max-lines]}])}
                      {:ns pallet.script.lib,
                       :name touch,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 204,
                       :var-type :fn,
                       :arglists ([file & {:as options}])}
                      {:ns pallet.script.lib,
                       :name update-package-list,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 571,
                       :var-type :fn,
                       :arglists ([& options]),
                       :doc "Update the list of packages available to the package manager from the\n   declared package sources."}
                      {:ns pallet.script.lib,
                       :name env-var-pairs,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 992,
                       :var-type :fn,
                       :arglists ([vars]),
                       :doc "Return a sequence of name=var strings for the given `vars` map."}
                      {:ns pallet.script.lib,
                       :name heredoc,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 380,
                       :var-type :fn,
                       :arglists ([path content {:keys [literal]}])}
                      {:ns pallet.script.lib,
                       :name chown,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 189,
                       :var-type :fn,
                       :arglists ([owner file & {:as options}])}
                      {:private true,
                       :ns pallet.script.lib,
                       :name sed-separators,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 210,
                       :var-type :var,
                       :doc "Possible sed separators"}
                      {:ns pallet.script.lib,
                       :name list-installed-packages,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 598,
                       :var-type :fn,
                       :arglists ([& options]),
                       :doc "List the installed packages"}
                      {:ns pallet.script.lib,
                       :name upstart-script-dir,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 884,
                       :var-type :fn,
                       :arglists ([])}
                      {:private true,
                       :ns pallet.script.lib,
                       :name chkconfig-default-options,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 810,
                       :var-type :var}
                      {:ns pallet.script.lib,
                       :name rmdir,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 385,
                       :var-type :fn,
                       :arglists ([directory & {:as options}]),
                       :doc "Remove the specified directory"}
                      {:ns pallet.script.lib,
                       :name spool-root,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 868,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name dnsdomainname,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 430,
                       :var-type :fn,
                       :arglists ([])}
                      {:ns pallet.script.lib,
                       :name redhat-version,
                       :file "pallet/script/lib.clj",
                       :column 1,
                       :line 443,
                       :var-type :fn,
                       :arglists ([])}),
               :ns-name pallet.script.lib,
               :doc "Script library for abstracting target host script differences"}
              {:vars ({:ns pallet.session,
                       :name target,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 199,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Current session target map."}
                      {:ns pallet.session,
                       :name executor,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 116,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Get the action executor."}
                      {:ns pallet.session,
                       :name event-fn,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 154,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Get the event-fn."}
                      {:ns pallet.session,
                       :name user,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 174,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Return the session `user`."}
                      {:ns pallet.session,
                       :name set-extension,
                       :file "pallet/session.clj",
                       :column 1,
                       :internal true,
                       :line 169,
                       :var-type :fn,
                       :arglists ([session extension-kw value]),
                       :doc "Update the extension."}
                      {:ns pallet.session,
                       :name merge-action-options,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 134,
                       :var-type :fn,
                       :arglists ([session m]),
                       :doc "Update the default action options modifiers defined on the session"}
                      {:ns pallet.session,
                       :name action-options,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 129,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Get the action options."}
                      {:ns pallet.session,
                       :name BaseSession,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 66,
                       :var-type :var}
                      {:ns pallet.session,
                       :name create,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 86,
                       :var-type :fn,
                       :arglists ([{:keys [recorder
                                           plan-state
                                           executor
                                           action-options
                                           user
                                           environment],
                                    :as args}]),
                       :doc "Create a session with the specified components."}
                      {:ns pallet.session,
                       :name update-extension,
                       :file "pallet/session.clj",
                       :column 1,
                       :internal true,
                       :line 164,
                       :var-type :fn,
                       :arglists ([session extension-kw f args]),
                       :doc "Update the extension."}
                      {:ns pallet.session,
                       :name set-environment,
                       :file "pallet/session.clj",
                       :column 1,
                       :internal true,
                       :line 144,
                       :var-type :fn,
                       :arglists ([session environment]),
                       :doc "Set the environment map."}
                      {:ns pallet.session,
                       :name set-recorder,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 186,
                       :var-type :fn,
                       :arglists ([session recorder]),
                       :doc "Return a session with `recorder` as the action result recorder."}
                      {:ns pallet.session,
                       :name update-environment,
                       :file "pallet/session.clj",
                       :column 1,
                       :internal true,
                       :line 149,
                       :var-type :fn,
                       :arglists ([session f args]),
                       :doc "Update the environment map."}
                      {:ns pallet.session,
                       :name validate-target-session,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 82,
                       :var-type :fn,
                       :arglists ([x])}
                      {:ns pallet.session,
                       :name extension,
                       :file "pallet/session.clj",
                       :column 1,
                       :internal true,
                       :line 159,
                       :var-type :fn,
                       :arglists ([session extension-kw]),
                       :doc "Get the extension data for the specified keyword."}
                      {:ns pallet.session,
                       :name execution-state,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 56,
                       :var-type :var}
                      {:ns pallet.session,
                       :name base-session?,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 74,
                       :var-type :fn,
                       :arglists ([x])}
                      {:ns pallet.session,
                       :name plan-state,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 106,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Get the plan state"}
                      {:ns pallet.session,
                       :name recorder,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 111,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Get the action recorder"}
                      {:ns pallet.session,
                       :name set-executor,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 123,
                       :var-type :fn,
                       :arglists ([session executor]),
                       :doc "Get the action executor."}
                      {:ns pallet.session,
                       :name set-user,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 180,
                       :var-type :fn,
                       :arglists ([session user]),
                       :doc "Return a session with `user` as the known admin user."}
                      {:ns pallet.session,
                       :name target-session?,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 78,
                       :var-type :fn,
                       :arglists ([x])}
                      {:ns pallet.session,
                       :name TargetSession,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 71,
                       :var-type :var}
                      {:ns pallet.session,
                       :name environment,
                       :file "pallet/session.clj",
                       :column 1,
                       :internal true,
                       :line 139,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Get the environment map."}
                      {:ns pallet.session,
                       :name set-target,
                       :file "pallet/session.clj",
                       :column 1,
                       :line 192,
                       :var-type :fn,
                       :arglists ([session target]),
                       :doc "Return a session with `:target` as the current target."}),
               :ns-name pallet.session,
               :doc "Functions for querying sessions.\n\nThe session is a map with well defined keys:\n\n`:execution-state`\n: a map of values used by the pallet implementation to record values\n  while executing.  The values are not held in mutable state.  The\n  values are:\n\n- `:executor`\n  : an function to execute actions.\n\n- `:recorder`\n  : an implementation of the Record and Results protocols.\n\n- `:action-options`\n  : the current action options\n\n- `:user`\n  : the default admin user\n\n- `:compute`\n  : the default compute service\n\n- `:environment`\n  : the effective environment\n\n- `:event-fn`\n  : the event notification function\n\n- `:extension`\n  : an extension map for abstractions build on pallet core, and\n  requiring execution state.  Un-namespaced keywords as keys are\n  reserved for pallet's own abstractions.\n\n`:plan-state`\n: an implementation of the StateGet and StateUpdate protocols.  The\n  data in the plan-state is mutable in plan functions.\n\n`:target`\n: the current target\n"}
              {:vars ({:ns pallet.settings,
                       :name update-settings,
                       :file "pallet/settings.clj",
                       :column 1,
                       :line 60,
                       :var-type :fn,
                       :arglists [[facility f & args]
                                  [facility options f & args]],
                       :doc "Update the settings for the specified host facility. The instance-id allows\n   the specification of specific instance of the facility (the default is\n   :default)."}
                      {:ns pallet.settings,
                       :name get-settings,
                       :file "pallet/settings.clj",
                       :column 1,
                       :line 10,
                       :var-type :fn,
                       :arglists ([session
                                   facility
                                   {:keys [instance-id default],
                                    :as options}]
                                  [session facility]),
                       :doc "Retrieve the settings for the specified host facility. The instance-id allows\n   the specification of specific instance of the facility. If passed a nil\n   `instance-id`, then `:default` is used"}
                      {:ns pallet.settings,
                       :name assoc-in-settings,
                       :file "pallet/settings.clj",
                       :column 1,
                       :line 47,
                       :var-type :fn,
                       :arglists ([session
                                   facility
                                   path
                                   value
                                   {:keys [instance-id], :as options}]
                                  [session facility path value]),
                       :doc "Set the settings for the specified host facility. The instance-id allows\n   the specification of specific instance of the facility (the default is\n   :default)."}
                      {:ns pallet.settings,
                       :name assoc-settings,
                       :file "pallet/settings.clj",
                       :column 1,
                       :line 32,
                       :var-type :fn,
                       :arglists ([session
                                   facility
                                   kv-pairs
                                   {:keys [instance-id], :as options}]
                                  [session facility kv-pairs]),
                       :doc "Set the settings for the specified host facility. The instance-id allows\n   the specification of specific instance of the facility (the default is\n   :default)."}
                      {:ns pallet.settings,
                       :name get-target-settings,
                       :file "pallet/settings.clj",
                       :column 1,
                       :line 22,
                       :var-type :fn,
                       :arglists ([session
                                   target
                                   facility
                                   {:keys [instance-id default],
                                    :as options}]
                                  [session target facility]),
                       :doc "Retrieve the settings for the `facility` on the `node`. The instance-id\n   allows the specification of specific instance of the facility. If passed a\n   nil `instance-id`, then `:default` is used"}),
               :ns-name pallet.settings,
               :doc "Settings maps provide an interface to the plan-state based on\n  target node ids and a facility keyword."}
              {:vars ({:ns pallet.spec,
                       :name phase-spec,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 283,
                       :var-type :fn,
                       :arglists ([phase]),
                       :doc "Return a phase spec map for a phase call.  A phase call is either a\n  phase keyword, or a sequence of phase keyword an arguments for the\n  phase function."}
                      {:ns pallet.spec,
                       :name TargetSpec,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 210,
                       :var-type :var,
                       :doc "A target combined with a spec"}
                      {:ns pallet.spec,
                       :name spec-for-target,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 189,
                       :var-type :fn,
                       :arglists ([predicate-spec-pairs target]),
                       :doc "Build a spec from a target and a sequence of predicate, spec pairs.\n  The returned spec will contain all specs where the predicate\n  returns true, merged in the order they are specified in the input\n  sequence."}
                      {:ns pallet.spec,
                       :name ServerSpec,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 37,
                       :var-type :var}
                      {:ns pallet.spec,
                       :name process-phase-calls,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 257,
                       :var-type :fn,
                       :arglists ([phase-calls]),
                       :doc "Process phases. Returns a phase list and a phase-map. Functions specified in\n  `phases` are identified with a keyword and a map from keyword to function.\n  The return vector contains a sequence of phase keywords and the map\n  identifying the anonymous phases."}
                      {:ns pallet.spec,
                       :name phase-kw,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 252,
                       :var-type :fn,
                       :arglists ([phase-call])}
                      {:ns pallet.spec,
                       :name merge-specs,
                       :file "pallet/spec.clj",
                       :column 1,
                       :internal true,
                       :line 60,
                       :var-type :fn,
                       :arglists ([algorithms a b]),
                       :doc "Merge specs using the specified algorithms."}
                      {:ns pallet.spec,
                       :name NodeOverride,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 29,
                       :var-type :var}
                      {:ns pallet.spec,
                       :name phase-args,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 247,
                       :var-type :fn,
                       :arglists ([phase-call])}
                      {:ns pallet.spec,
                       :name PhaseWithArgs,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 241,
                       :var-type :var}
                      {:ns pallet.spec,
                       :name PhaseSpec,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 279,
                       :var-type :var}
                      {:ns pallet.spec,
                       :name phases-with-meta,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 101,
                       :var-type :fn,
                       :arglists ([phases-map
                                   phases-meta
                                   default-phase-meta]),
                       :doc "Takes a `phases-map` and applies the default phase metadata and the\n  `phases-meta` to the phases in it."}
                      {:ns pallet.spec,
                       :name PhaseCall,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 244,
                       :var-type :var}
                      {:ns pallet.spec,
                       :name bootstrapped-meta,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 87,
                       :var-type :var,
                       :doc "Executes on bootstrapped nodes, with admin user credentials."}
                      {:ns pallet.spec,
                       :name PhasesMeta,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 34,
                       :var-type :var}
                      {:ns pallet.spec,
                       :name extend-specs,
                       :file "pallet/spec.clj",
                       :column 1,
                       :internal true,
                       :line 65,
                       :var-type :fn,
                       :arglists ([spec inherits algorithms]
                                  [spec inherits]),
                       :doc "Return spec with inherits, a sequence of specs, merged into it."}
                      {:private true,
                       :ns pallet.spec,
                       :name targets-extension,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 161,
                       :var-type :var,
                       :doc "Keyword for the targets extension"}
                      {:ns pallet.spec,
                       :name target-with-specs,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 215,
                       :var-type :fn,
                       :arglists ([predicate-spec-pairs target]),
                       :doc "Build a target from a target and a sequence of predicate, spec pairs.\n  The returned target will contain all specs where the predicate\n  returns true, merged in the order they are specified in the input\n  sequence."}
                      {:ns pallet.spec,
                       :name phase-plan,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 232,
                       :var-type :fn,
                       :arglists ([spec {:keys [phase args]}]),
                       :doc "Return a plan-fn for `spec`, corresponding to the phase-spec map, `phase`."}
                      {:ns pallet.spec,
                       :name merge-spec-algorithm,
                       :file "pallet/spec.clj",
                       :column 1,
                       :internal true,
                       :line 53,
                       :var-type :var,
                       :doc "Map from key to merge algorithm. Specifies how specs are merged."}
                      {:ns pallet.spec,
                       :name unbootstrapped-meta,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 81,
                       :var-type :var,
                       :doc "Executes on non bootstrapped nodes, with image credentials."}
                      {:ns pallet.spec,
                       :name server-spec,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 117,
                       :var-type :fn,
                       :arglists ([{:keys [phases
                                           phases-meta
                                           default-phases
                                           packager
                                           extends
                                           roles],
                                    :as options}]),
                       :doc "Create a server-spec.\n\n   - :phases         a hash-map used to define phases. Phases are inherited by\n                     anything that :extends the server-spec.\n                     Standard phases are:\n     - :bootstrap    run on first boot of a new node\n     - :configure    defines the configuration of the node\n   - :default-phases a sequence specifying the default phases\n   - :phases-meta    metadata to add to the phases\n   - :extends        takes a server-spec, or sequence thereof, and is used to\n                     inherit phases, etc.\n   - :roles          defines a sequence of roles for the server-spec. Inherited\n                     by anything that :extends the server-spec.\n   - :packager       override the choice of packager to use\n\nFor a given phase, inherited phase functions are run first, in the order\nspecified in the `:extends` argument."}
                      {:ns pallet.spec,
                       :name set-targets,
                       :file "pallet/spec.clj",
                       :column 1,
                       :internal true,
                       :line 171,
                       :var-type :fn,
                       :arglists ([session targets]),
                       :doc "Set the target-maps in the session targets extension."}
                      {:ns pallet.spec,
                       :name target-phase,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 304,
                       :var-type :fn,
                       :arglists ([target-specs phase-spec]),
                       :doc "Return a target phase map"}
                      {:ns pallet.spec,
                       :name default-phases,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 147,
                       :var-type :fn,
                       :arglists ([specs]),
                       :doc "Return a sequence with the default phases for `specs`.  Applies a\n  total ordering to the default-phases specified in all the specs."}
                      {:ns pallet.spec,
                       :name PhaseMeta,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 25,
                       :var-type :var}
                      {:ns pallet.spec,
                       :name targets,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 177,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Return the sequence of targets for the current operation.  The\n  targets are recorded in the session targets extension."}
                      {:ns pallet.spec,
                       :name target-plan,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 294,
                       :var-type :fn,
                       :arglists ([{:keys [target spec],
                                    :as target-spec}
                                   phase-spec]),
                       :doc "Return a target plan map"}
                      {:ns pallet.spec,
                       :name PhaseMap,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 22,
                       :var-type :var}
                      {:ns pallet.spec,
                       :name add-target,
                       :file "pallet/spec.clj",
                       :column 1,
                       :internal true,
                       :line 165,
                       :var-type :fn,
                       :arglists ([session target]),
                       :doc "Record the target-map in the session targets extension."}
                      {:ns pallet.spec,
                       :name default-phase-meta,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 92,
                       :var-type :var,
                       :doc "The bootstrap phase is executed with the image credentials, and\nonly not flagged with a :bootstrapped keyword."}
                      {:ns pallet.spec,
                       :name ExtendedServerSpec,
                       :file "pallet/spec.clj",
                       :column 1,
                       :line 45,
                       :var-type :var}),
               :ns-name pallet.spec,
               :doc "Provides server-spec functionality.\n\nA server-spec can specify phases that provide facets of a particular\nservice."}
              {:vars ({:ns pallet.ssh.credentials,
                       :name ensure-ssh-credential,
                       :file "pallet/ssh/credentials.clj",
                       :column 1,
                       :line 64,
                       :var-type :fn,
                       :arglists ([{:keys [private-key-path
                                           public-key-path],
                                    :as user}
                                   {:keys [comment
                                           key-type
                                           key-size
                                           passphrase],
                                    :as options}]),
                       :doc "Given a user map, ensure credentials exist at the specified :private-key-path\n  and :public-key-path.  Logs and prints any issues found with the credentials.\n\n\n  Returns a keyword indicating the credentials' status.\n\n  - :not-found\n  - :private-key-not-found\n  - :public-key-not-found\n  - :invalid-key\n  - :valid-key"}
                      {:ns pallet.ssh.credentials,
                       :name ssh-credential-status,
                       :file "pallet/ssh/credentials.clj",
                       :column 1,
                       :line 8,
                       :var-type :fn,
                       :arglists ([{:keys [password
                                           private-key
                                           private-key-path
                                           public-key-path],
                                    :as user}]),
                       :doc "Given a user map, returns a keyword indicating the credentials' status.\n\n  - :not-found\n  - :private-key-not-found\n  - :public-key-not-found\n  - :invalid-key\n  - :valid-key"}
                      {:ns pallet.ssh.credentials,
                       :name generate-keypair-files,
                       :file "pallet/ssh/credentials.clj",
                       :column 1,
                       :line 51,
                       :var-type :fn,
                       :arglists ([{:keys [private-key-path
                                           public-key-path],
                                    :as user}
                                   {:keys [comment
                                           key-type
                                           key-size
                                           passphrase],
                                    :or {key-type :rsa, key-size 2048},
                                    :as options}]),
                       :doc "Generate keypair files for the given user and options"}),
               :ns-name pallet.ssh.credentials,
               :doc "Functions for working with ssh credentials."}
              {:vars ({:private true,
                       :ns pallet.ssh.execute,
                       :name target,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 71,
                       :var-type :fn,
                       :arglists ([node user])}
                      {:private true,
                       :ns pallet.ssh.execute,
                       :name ssh-mktemp,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 45,
                       :var-type :fn,
                       :arglists ([connection prefix script-env]),
                       :doc "Create a temporary remote file using the `ssh-session` and the filename\n  `prefix`"}
                      {:ns pallet.ssh.execute,
                       :name get-connection,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 87,
                       :var-type :fn,
                       :arglists ([ssh-connection node user])}
                      {:ns pallet.ssh.execute,
                       :name ssh-script-on-target,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 139,
                       :var-type :fn,
                       :arglists ([ssh-connection
                                   node
                                   user
                                   {:keys [context], :as action}
                                   [options script]]),
                       :doc "Execute a bash action on the target via ssh."}
                      {:ns pallet.ssh.execute,
                       :name ssh-to-local,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 257,
                       :var-type :fn,
                       :arglists ([ssh-connection node user value]),
                       :doc "Transfer a file from the target machine to the origin via ssh."}
                      {:ns pallet.ssh.execute,
                       :name credentials,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 34,
                       :var-type :fn,
                       :arglists ([user]),
                       :doc "Return the credentials to use for authentication.  This is not\n  necessarily based on the admin user (e.g. when bootstrapping, it is\n  based on the image user)."}
                      {:ns pallet.ssh.execute,
                       :name ssh-from-local,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 226,
                       :var-type :fn,
                       :arglists ([ssh-connection node user value]),
                       :doc "Transfer a file from the origin machine to the target via ssh."}
                      {:ns pallet.ssh.execute,
                       :name user->credentials,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 26,
                       :var-type :fn,
                       :arglists ([user])}
                      {:ns pallet.ssh.execute,
                       :name with-connection,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 129,
                       :macro true,
                       :var-type :macro,
                       :arglists ([ssh-connection
                                   node
                                   user
                                   [connection]
                                   &
                                   body]),
                       :doc "Execute the body with a connection to the current target node,"}
                      {:ns pallet.ssh.execute,
                       :name release-connection,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 94,
                       :var-type :fn,
                       :arglists ([ssh-connection connection])}
                      {:ns pallet.ssh.execute,
                       :name with-ssh-tunnel,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 268,
                       :macro true,
                       :var-type :macro,
                       :arglists ([transport session tunnels & body]),
                       :doc "Execute the body with an ssh-tunnel available for the ports given in the\n   tunnels map. Automatically closes port forwards on completion.\n\n   Tunnels should be a map from local ports (integers) to either\n     1) An integer remote port. Remote host is assumed to be \"localhost\".\n     2) A vector of remote host and remote port. eg, [\"yahoo.com\" 80].\n\n   e.g.\n        (with-ssh-tunnel session {2222 22}\n           ;; do something on local port 2222\n           session)"}
                      {:ns pallet.ssh.execute,
                       :name with-connection*,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :internal true,
                       :line 107,
                       :var-type :fn,
                       :arglists ([ssh-connection node user f]),
                       :doc "Execute a function with a connection to the current target node,"}
                      {:private true,
                       :ns pallet.ssh.execute,
                       :name ssh-upload,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :line 202,
                       :var-type :fn,
                       :arglists ([user connection file remote-name]),
                       :doc "Upload a file to a remote location via sftp"}
                      {:ns pallet.ssh.execute,
                       :name with-connection-exception-handler,
                       :file "pallet/ssh/execute.clj",
                       :column 1,
                       :internal true,
                       :line 97,
                       :var-type :fn,
                       :arglists ([e])}),
               :ns-name pallet.ssh.execute,
               :doc "Execution of pallet actions via ssh"}
              {:vars ({:var-type :fn,
                       :ns pallet.ssh.file-upload.sftp-upload,
                       :name map->SftpUpload,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 106,
                       :arglists ([m__5869__auto__]),
                       :doc "Factory function for class pallet.ssh.file_upload.sftp_upload.SftpUpload, taking a map of keywords to field values."}
                      {:ns pallet.ssh.file-upload.sftp-upload,
                       :name sftp-put-md5,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 99,
                       :var-type :fn,
                       :arglists ([connection path md5])}
                      {:ns pallet.ssh.file-upload.sftp-upload,
                       :name upload-dir,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 42,
                       :var-type :fn,
                       :arglists ([upload-root username]),
                       :doc "Return the upload directory for username. A :home at the start of the\n  upload directory will be replaced by the user's home directory."}
                      {:ns pallet.ssh.file-upload.sftp-upload,
                       :name sftp-ensure-dir,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 60,
                       :var-type :fn,
                       :arglists ([connection target-path]),
                       :doc "Ensure directory exists"}
                      {:var-type :fn,
                       :ns pallet.ssh.file-upload.sftp-upload,
                       :name ->SftpUpload,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 106,
                       :arglists ([upload-root ssh-connection]),
                       :doc "Positional factory function for class pallet.ssh.file_upload.sftp_upload.SftpUpload."}
                      {:ns pallet.ssh.file-upload.sftp-upload,
                       :name md5,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 30,
                       :var-type :fn,
                       :tag java.lang.String,
                       :arglists ([path])}
                      {:ns pallet.ssh.file-upload.sftp-upload,
                       :name sftp-upload,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 137,
                       :var-type :fn,
                       :arglists ([{:keys [upload-root ssh-connection],
                                    :as options}]),
                       :doc "Create an instance of the SFTP upload strategy."}
                      {:ns pallet.ssh.file-upload.sftp-upload,
                       :name sftp-remote-md5,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 90,
                       :var-type :fn,
                       :arglists ([connection md5-path]),
                       :doc "Return the md5 for a remote file."}
                      {:ns pallet.ssh.file-upload.sftp-upload,
                       :name sftp-upload-file,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 80,
                       :var-type :fn,
                       :arglists ([connection local-path upload-path]),
                       :doc "Upload a file via SFTP"}
                      {:ns pallet.ssh.file-upload.sftp-upload,
                       :name upload-path,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 53,
                       :var-type :fn,
                       :arglists ([upload-root username target-path])}
                      {:ns pallet.ssh.file-upload.sftp-upload,
                       :name md5-digest-input-stream,
                       :file "pallet/ssh/file_upload/sftp_upload.clj",
                       :column 1,
                       :line 24,
                       :var-type :fn,
                       :arglists ([str]),
                       :doc "Return a tuple containing a MessageDigest and a DigestInputStream."}),
               :ns-name pallet.ssh.file-upload.sftp-upload,
               :doc "Implementation of file upload using SFTP.\n\n  This assumes that chown/chgrp/chmod are all going to work."}
              {:vars ({:ns pallet.ssh.node-state.no-state,
                       :name no-checksum,
                       :file "pallet/ssh/node_state/no_state.clj",
                       :column 1,
                       :line 19,
                       :var-type :fn,
                       :arglists ([])}
                      {:var-type :fn,
                       :ns pallet.ssh.node-state.no-state,
                       :name ->NoBackup,
                       :file "pallet/ssh/node_state/no_state.clj",
                       :column 1,
                       :line 7,
                       :arglists ([]),
                       :doc "Positional factory function for class pallet.ssh.node_state.no_state.NoBackup."}
                      {:var-type :fn,
                       :ns pallet.ssh.node-state.no-state,
                       :name map->NoBackup,
                       :file "pallet/ssh/node_state/no_state.clj",
                       :column 1,
                       :line 7,
                       :arglists ([m__5869__auto__]),
                       :doc "Factory function for class pallet.ssh.node_state.no_state.NoBackup, taking a map of keywords to field values."}
                      {:var-type :fn,
                       :ns pallet.ssh.node-state.no-state,
                       :name ->NoChecksum,
                       :file "pallet/ssh/node_state/no_state.clj",
                       :column 1,
                       :line 11,
                       :arglists ([]),
                       :doc "Positional factory function for class pallet.ssh.node_state.no_state.NoChecksum."}
                      {:var-type :fn,
                       :ns pallet.ssh.node-state.no-state,
                       :name map->NoChecksum,
                       :file "pallet/ssh/node_state/no_state.clj",
                       :column 1,
                       :line 11,
                       :arglists ([m__5869__auto__]),
                       :doc "Factory function for class pallet.ssh.node_state.no_state.NoChecksum, taking a map of keywords to field values."}
                      {:ns pallet.ssh.node-state.no-state,
                       :name no-backup,
                       :file "pallet/ssh/node_state/no_state.clj",
                       :column 1,
                       :line 16,
                       :var-type :fn,
                       :arglists ([])}),
               :ns-name pallet.ssh.node-state.no-state,
               :doc "A node-state implementation that maintains no node state"}
              {:vars ({:methods ({:var-type :protocol-method,
                                  :ns pallet.ssh.node-state.protocols,
                                  :doc "Save the MD5 for the file at path.",
                                  :arglists ([_ action-options path]),
                                  :name record-checksum}
                                 {:var-type :protocol-method,
                                  :ns pallet.ssh.node-state.protocols,
                                  :doc "Verify the expected MD5 of the file at path.",
                                  :arglists ([_ action-options path]),
                                  :name verify-checksum}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.ssh.node-state.protocols,
                       :name FileChecksum,
                       :file "pallet/ssh/node_state/protocols.clj",
                       :column 1,
                       :line 9}
                      {:methods ({:var-type :protocol-method,
                                  :ns pallet.ssh.node-state.protocols,
                                  :doc "Notify that path has been modified.\n    Options include, :versioning, :no-versioning, :max-versions",
                                  :arglists ([_
                                              action-options
                                              path
                                              options]),
                                  :name new-file-content}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.ssh.node-state.protocols,
                       :name FileBackup,
                       :file "pallet/ssh/node_state/protocols.clj",
                       :column 1,
                       :line 4}),
               :ns-name pallet.ssh.node-state.protocols,
               :doc "Protocols for node state updates"}
              {:vars ({:ns pallet.ssh.node-state.state-root,
                       :name md5-path,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 43,
                       :var-type :fn,
                       :arglists ([state-path]),
                       :doc "Return a path for the md5 file for state-path under state-root."}
                      {:var-type :fn,
                       :ns pallet.ssh.node-state.state-root,
                       :name ->StateRootChecksum,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 183,
                       :arglists ([state-root]),
                       :doc "Positional factory function for class pallet.ssh.node_state.state_root.StateRootChecksum."}
                      {:var-type :fn,
                       :ns pallet.ssh.node-state.state-root,
                       :name map->StateRootChecksum,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 183,
                       :arglists ([m__5869__auto__]),
                       :doc "Factory function for class pallet.ssh.node_state.state_root.StateRootChecksum, taking a map of keywords to field values."}
                      {:private true,
                       :ns pallet.ssh.node-state.state-root,
                       :name adjust-root,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 19,
                       :var-type :fn,
                       :arglists ([action-options script-dir path])}
                      {:ns pallet.ssh.node-state.state-root,
                       :name create-path-with-template,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 49,
                       :var-type :fn,
                       :arglists ([template-path new-path]),
                       :doc "Create the /var/lib/pallet directory if required, ensuring correct\npermissions. Note this is not the final directory."}
                      {:ns pallet.ssh.node-state.state-root,
                       :name state-root-checksum,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 198,
                       :var-type :fn,
                       :arglists ([{:keys [state-root], :as options}]),
                       :doc "Return a state-root checksum instance that can verify md5 checksums."}
                      {:var-type :fn,
                       :ns pallet.ssh.node-state.state-root,
                       :name ->StateRootBackup,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 173,
                       :arglists ([state-root]),
                       :doc "Positional factory function for class pallet.ssh.node_state.state_root.StateRootBackup."}
                      {:ns pallet.ssh.node-state.state-root,
                       :name state-path,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 35,
                       :var-type :fn,
                       :arglists ([action-options state-root path]),
                       :doc "Return a path under state-root for a given path."}
                      {:var-type :fn,
                       :ns pallet.ssh.node-state.state-root,
                       :name map->StateRootBackup,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 173,
                       :arglists ([m__5869__auto__]),
                       :doc "Factory function for class pallet.ssh.node_state.state_root.StateRootBackup, taking a map of keywords to field values."}
                      {:ns pallet.ssh.node-state.state-root,
                       :name state-root-backup,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 193,
                       :var-type :fn,
                       :arglists ([{:keys [state-root], :as options}]),
                       :doc "Return a state-root backup instance that can keep backups."}
                      {:ns pallet.ssh.node-state.state-root,
                       :name state-path*,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 30,
                       :var-type :fn,
                       :arglists ([action-options
                                   state-root
                                   script-dir
                                   path]),
                       :doc "Return a path under state-root for a given path."}
                      {:ns pallet.ssh.node-state.state-root,
                       :name default-state-root,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 14,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Provide a computed default for state-root if it isn't set."}
                      {:ns pallet.ssh.node-state.state-root,
                       :name record,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 125,
                       :var-type :fn,
                       :arglists ([path
                                   state-path
                                   {:keys [max-versions
                                           no-versioning
                                           versioning],
                                    :or {max-versions 5,
                                         versioning :numbered}}]),
                       :doc "Script to record a new (version of a) file in state-root"}
                      {:ns pallet.ssh.node-state.state-root,
                       :name record-md5,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 159,
                       :var-type :fn,
                       :arglists ([path md5-path]),
                       :doc "Script to record a file's md5"}
                      {:ns pallet.ssh.node-state.state-root,
                       :name verify,
                       :file "pallet/ssh/node_state/state_root.clj",
                       :column 1,
                       :line 85,
                       :var-type :fn,
                       :arglists ([path state-path md5-path]),
                       :doc "verify if the files at path and state-path are identical, and\n  whether they match the md5-path."}),
               :ns-name pallet.ssh.node-state.state-root,
               :doc "A node-state implementation that maintains node state in a parallel directory\n  tree."}
              {:vars ({:ns pallet.ssh.node-state,
                       :name record-checksum,
                       :file "pallet/ssh/node_state.clj",
                       :column 1,
                       :line 17,
                       :var-type :fn,
                       :arglists ([ns session path]),
                       :doc "Save the MD5 for the file at path."}
                      {:var-type :multi-method,
                       :ns pallet.ssh.node-state,
                       :name file-backup,
                       :file "pallet/ssh/node_state.clj",
                       :column 1,
                       :line 22,
                       :doc "Instantiate a file-backup provider based on keyword and option map."}
                      {:var-type :multi-method,
                       :ns pallet.ssh.node-state,
                       :name file-checksum,
                       :file "pallet/ssh/node_state.clj",
                       :column 1,
                       :line 26,
                       :doc "Instantiate a file-checksum provider based on keyword and option map."}
                      {:ns pallet.ssh.node-state,
                       :name verify-checksum,
                       :file "pallet/ssh/node_state.clj",
                       :column 1,
                       :line 12,
                       :var-type :fn,
                       :arglists ([ns session path]),
                       :doc "Verify the expected MD5 of the file at path."}
                      {:ns pallet.ssh.node-state,
                       :name new-file-content,
                       :file "pallet/ssh/node_state.clj",
                       :column 1,
                       :line 6,
                       :var-type :fn,
                       :arglists ([ns session path options]),
                       :doc "Notify that path has been modified.\n    Options include, :versioning, :no-versioning, :max-versions"}),
               :ns-name pallet.ssh.node-state,
               :doc "Node state tracking"}
              {:vars ({:methods ({:var-type :protocol-method,
                                  :ns pallet.ssh.script-upload.protocols,
                                  :doc "Upload a file to the target-path, and return any script needed to\n    be run on the node to get the file into place.\n\n    file-options is a map of options as passed to remote-file, for file\n    ownership, permissions, etc.\n\n    action-options can contain a :sudo-user, specify the user to install\n    the file as.",
                                  :arglists ([_
                                              local-path
                                              target-path
                                              file-options
                                              action-options]),
                                  :name upload-file}),
                       :var-type :protocol,
                       :doc nil,
                       :ns pallet.ssh.script-upload.protocols,
                       :name ScriptUpload,
                       :file "pallet/ssh/script_upload/protocols.clj",
                       :column 1,
                       :line 4}),
               :ns-name pallet.ssh.script-upload.protocols,
               :doc "Protocols for uploading scripts to be run on the remote machine"}
              {:vars ({:ns pallet.tag,
                       :name state-tag-name,
                       :file "pallet/tag.clj",
                       :column 1,
                       :line 9,
                       :var-type :var}
                      {:ns pallet.tag,
                       :name set-state-flag,
                       :file "pallet/tag.clj",
                       :column 1,
                       :line 17,
                       :var-type :fn,
                       :arglists ([node state-name]),
                       :doc "Sets the boolean `state-name` flag on `node`."}
                      {:ns pallet.tag,
                       :name read-or-empty-map,
                       :file "pallet/tag.clj",
                       :column 1,
                       :line 11,
                       :var-type :fn,
                       :arglists ([s])}
                      {:ns pallet.tag,
                       :name has-state-flag?,
                       :file "pallet/tag.clj",
                       :column 1,
                       :line 29,
                       :var-type :fn,
                       :arglists ([node state-name]),
                       :doc "Return a predicate to test for a state-flag having been set."}),
               :ns-name pallet.tag,
               :doc "Tagging of nodes."}
              {:vars ({:ns pallet.target-info,
                       :name admin-user,
                       :file "pallet/target_info.clj",
                       :column 1,
                       :line 11,
                       :var-type :fn,
                       :arglists ([session]),
                       :doc "Return the effective admin `user`, from the target or the global admin user."}),
               :ns-name pallet.target-info,
               :doc "Functions that return information on the current target."}
              {:vars ({:ns pallet.user,
                       :name ssh-home,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 42,
                       :var-type :var}
                      {:ns pallet.user,
                       :name with-admin-user,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 123,
                       :macro true,
                       :var-type :macro,
                       :arglists ([user & exprs]),
                       :doc "Specify the admin user for running remote commands.  The user is\n   specified either as user map (see the pallet.user/make-user\n   convenience fn).\n\n   This is mainly for use at the repl, since the admin user can be specified\n   functionally using the :user key in a lift or converge call, or in the\n   environment."}
                      {:ns pallet.user,
                       :name key-files,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 40,
                       :var-type :var}
                      {:ns pallet.user,
                       :name effective-username,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 148,
                       :var-type :fn,
                       :arglists ([{:keys [no-sudo sudo-user username],
                                    :as user}]),
                       :doc "Return the effective username for a user map."}
                      {:ns pallet.user,
                       :name default-public-key-path,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 50,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Return the default public key path"}
                      {:ns pallet.user,
                       :name sudo-username,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 142,
                       :var-type :fn,
                       :arglists ([{:keys [no-sudo sudo-user username],
                                    :as user}]),
                       :doc "Return the sudo username for a user map.  Returns nil if :no-sudo\n  is true."}
                      {:var-type :fn,
                       :ns pallet.user,
                       :name default-user,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 98,
                       :arglists ([]),
                       :doc "The admin user is used for running remote admin commands that require\n   root permissions.  The default admin user is taken from the\n   pallet.admin.username property.  If not specified then the user.name property\n   is used. The admin user can also be specified in config.clj when running\n   tasks from the command line.\n\n## Function Signatures\n\n  - -> User",
                       :sig [[:-
                              (both
                               (pred has-credentials?)
                               {(optional-key :public-key) (either
                                                            java.lang.String
                                                            bytes),
                                (optional-key :sudo-password) java.lang.String,
                                (optional-key :private-key-path) java.lang.String,
                                (optional-key :password) java.lang.String,
                                :username java.lang.String,
                                (optional-key :temp-key) java.lang.Boolean,
                                (optional-key :public-key-path) java.lang.String,
                                (optional-key :passphrase) (either
                                                            java.lang.String
                                                            bytes),
                                (optional-key :no-sudo) java.lang.Boolean,
                                (optional-key :private-key) (either
                                                             java.lang.String
                                                             bytes),
                                (optional-key :sudo-user) java.lang.String})]]}
                      {:ns pallet.user,
                       :name obfuscated-passwords,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 135,
                       :var-type :fn,
                       :arglists ([user]),
                       :doc "Return a user with obfuscated passwords"}
                      {:ns pallet.user,
                       :name UserArgMap,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 10,
                       :var-type :var}
                      {:ns pallet.user,
                       :name has-credentials?,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 25,
                       :var-type :fn,
                       :arglists ([{:keys [password
                                           private-key-path
                                           private-key]}]),
                       :doc "Check to see if some form of credential is specified."}
                      {:ns pallet.user,
                       :name *admin-user*,
                       :file "pallet/user.clj",
                       :column 1,
                       :dynamic true,
                       :line 114,
                       :var-type :var,
                       :doc "The admin user is used for running remote admin commands that require\n   root permissions.  The default admin user is taken from the\n   pallet.admin.username property.  If not specified then the user.name property\n   is used. The admin user can also be specified in config.clj when running\n   tasks from the command line."}
                      {:var-type :fn,
                       :ns pallet.user,
                       :name make-user,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 57,
                       :arglists ([username
                                   {:keys [public-key-path
                                           private-key-path
                                           public-key
                                           private-key
                                           passphrase
                                           password
                                           sudo-password
                                           no-sudo
                                           sudo-user],
                                    :as options}]),
                       :doc "Creates a User record with the given username and options. Generally used\n   in conjunction with *admin-user* and with-admin-user, or passed\n   to `lift` or `converge` as the named :user argument.\n\n   Options:\n\n`:public-key-path`\n: path string to public key file\n\n`:private-key-path`\n: path string to private key file\n\n`:public-key`\n: public key as a string or byte array\n\n`:private-key`\n: private key as a string or byte array\n\n`:passphrase`\n: passphrase for private key\n\n`:password`\n: ssh user password\n\n`:sudo-password`\n: password for sudo (defaults to :password)\n\n`:sudo-user`\n: the user to sudo to\n\n`:no-sudo`\n: flag to not use sudo (e.g. when the user has root privileges).\n\n## Function Signatures\n\n  - String UserArgMap -> User",
                       :sig [[java.lang.String
                              {(optional-key :public-key) (either
                                                           java.lang.String
                                                           bytes),
                               (optional-key :sudo-password) java.lang.String,
                               (optional-key :private-key-path) java.lang.String,
                               (optional-key :password) java.lang.String,
                               (optional-key :temp-key) java.lang.Boolean,
                               (optional-key :public-key-path) java.lang.String,
                               (optional-key :passphrase) (either
                                                           java.lang.String
                                                           bytes),
                               (optional-key :no-sudo) java.lang.Boolean,
                               (optional-key :private-key) (either
                                                            java.lang.String
                                                            bytes),
                               (optional-key :sudo-user) java.lang.String}
                              :-
                              (both
                               (pred has-credentials?)
                               {(optional-key :public-key) (either
                                                            java.lang.String
                                                            bytes),
                                (optional-key :sudo-password) java.lang.String,
                                (optional-key :private-key-path) java.lang.String,
                                (optional-key :password) java.lang.String,
                                :username java.lang.String,
                                (optional-key :temp-key) java.lang.Boolean,
                                (optional-key :public-key-path) java.lang.String,
                                (optional-key :passphrase) (either
                                                            java.lang.String
                                                            bytes),
                                (optional-key :no-sudo) java.lang.Boolean,
                                (optional-key :private-key) (either
                                                             java.lang.String
                                                             bytes),
                                (optional-key :sudo-user) java.lang.String})]]}
                      {:ns pallet.user,
                       :name User,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 30,
                       :var-type :var}
                      {:ns pallet.user,
                       :name user?,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 35,
                       :var-type :fn,
                       :arglists ([m]),
                       :doc "Predicate to test for a valid user map."}
                      {:ns pallet.user,
                       :name default-private-key-path,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 44,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Return the default private key path."}
                      {:ns pallet.user,
                       :name UserUnconstrained,
                       :file "pallet/user.clj",
                       :column 1,
                       :line 22,
                       :var-type :var}),
               :ns-name pallet.user,
               :doc "User for authentication."}
              {:vars ({:ns pallet.utils.async,
                       :name from-chan,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 62,
                       :var-type :fn,
                       :arglists ([c]),
                       :doc "Return a lazy sequence which contains all values from a channel, c."}
                      {:ns pallet.utils.async,
                       :name thread-fn,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 102,
                       :var-type :fn,
                       :arglists ([f]),
                       :doc "Execute the zero-arity function, f, in a new thread, returning a\n channel for the result.  The result will be a rex-tuple, where the\n result is the result of calling the function f."}
                      {:ns pallet.utils.async,
                       :name channel?,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 13,
                       :var-type :fn,
                       :arglists ([x]),
                       :no-check true}
                      {:ns pallet.utils.async,
                       :name map-thread,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 113,
                       :var-type :fn,
                       :arglists ([f coll]),
                       :doc "Apply zero-arity function, f, to each element of coll, using a\n  separate thread for each element.  Return a non-lazy sequence of\n  channels for the results.  The function f should return a result,\n  exception tuple."}
                      {:ns pallet.utils.async,
                       :name concat-chans,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 70,
                       :var-type :fn,
                       :arglists ([chans to close?] [chans to]),
                       :doc "Concatenate values from all of the channels, chans, onto the to channel.\n  By default, the to channel will be closed when all values have been\n  written, but this can be controlled by the close? argument.\n  Ordering of values is from a single chan is preserved, but the channels\n  may be sampled in any order."}
                      {:ns pallet.utils.async,
                       :name go-logged,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 19,
                       :macro true,
                       :var-type :macro,
                       :arglists ([& body]),
                       :doc "Provides a go macro, where any exception thrown by body is logged."}
                      {:ns pallet.utils.async,
                       :name exec-operation,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 198,
                       :var-type :fn,
                       :arglists ([ch
                                   {:keys [async
                                           timeout-ms
                                           timeout-val]}]),
                       :doc "Execute the channel.  If `:async` is true, simply returns the\n  chnel, otherwise reads a value from the chnel using the timeout\n  values if specified."}
                      {:ns pallet.utils.async,
                       :name pipe-timeout,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 48,
                       :var-type :fn,
                       :arglists ([in-ch
                                   timeout-ms
                                   timeout-val
                                   out-ch]),
                       :doc "Copy values from in-ch to out-ch until ch is closed, or the\n  specified timeout period expires.  If a timeout occurs, timeout-val\n  will be written to the output channel.  The out-ch will be closed."}
                      {:ns pallet.utils.async,
                       :name sync*,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 212,
                       :var-type :fn,
                       :arglists ([f]),
                       :doc "Call an asynchrouns function that expects a single channel argument,\n  read and return a value from that channel"}
                      {:ns pallet.utils.async,
                       :name ReadPort,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 16,
                       :var-type :var}
                      {:ns pallet.utils.async,
                       :name pipe,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 32,
                       :var-type :fn,
                       :arglists ([from to] [from to close?]),
                       :doc "Takes elements from the from channel and supplies them to the to\n  channel. By default, the to channel will be closed when the\n  from channel closes, but can be determined by the close?\n  parameter."}
                      {:ns pallet.utils.async,
                       :name sync,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 220,
                       :macro true,
                       :var-type :macro,
                       :arglists ([fn-call]),
                       :doc "Given a a fn-call form, add a final channel argument, which is read\n  for a return value."}
                      {:ns pallet.utils.async,
                       :name map-chan,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 169,
                       :var-type :fn,
                       :arglists ([from f to]),
                       :doc "Apply a function, f, to values from the from channel, writing the\n  return to the to channel. Closes the to channel when the from\n  channel closes."}
                      {:ns pallet.utils.async,
                       :name deref-rex,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 182,
                       :var-type :fn,
                       :arglists ([ch]),
                       :doc "Read a rex-map from the specified channel.  If there is an\n  exception, throw it, otherwise return the result."}
                      {:ns pallet.utils.async,
                       :name reduce-results,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 122,
                       :var-type :fn,
                       :arglists ([in-ch exception-msg out-ch]
                                  [in-ch out-ch]),
                       :doc "Reduce the results of a sequence of [result exception] tuples read\n  from channel in-ch, writing a single [result exception] to out-ch,\n  where the result is the sequence of all the read results\n  concatenated, and the exception is a composite exception of all the\n  read exceptions.  The exception data contains a :results key with\n  the accumulated results."}
                      {:ns pallet.utils.async,
                       :name WritePort,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 17,
                       :var-type :var}
                      {:ns pallet.utils.async,
                       :name go-try,
                       :file "pallet/utils/async.clj",
                       :column 1,
                       :line 88,
                       :macro true,
                       :var-type :macro,
                       :arglists ([ch & body]),
                       :doc "Provides a go macro which executes its body inside a try/catch block.\n  If an exception is thrown by the body, a rex-tuple is written to the\n  channel ch.  Returns the channel for the go-block.\n\n  NB. the channel, ch, should be buffered if the caller is going to\n  block on the returned channel before reading ch."}),
               :ns-name pallet.utils.async,
               :doc "Generally useful async functions"}
              {:vars ({:ns pallet.utils.edn,
                       :name load-edn,
                       :file "pallet/utils/edn.clj",
                       :column 1,
                       :line 9,
                       :var-type :fn,
                       :arglists ([f]),
                       :doc "Load EDN File.  If the file is invalid, an exception is thrown\n  specifying the location in the file at which the invalid syntax\n  occured."}),
               :ns-name pallet.utils.edn,
               :doc "EDN utilities"}
              {:vars ({:ns pallet.utils.multi,
                       :name dispatch-key-fn,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 26,
                       :var-type :fn,
                       :arglists ([key-fn
                                   {:keys [default hierarchy name],
                                    :or {default :default}}]),
                       :doc "Return a function, that will dispatch into a method map based on\n  the value returned by the key-fn."}
                      {:ns pallet.utils.multi,
                       :name name-with-attributes,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 140,
                       :var-type :fn,
                       :arglists ([name args]),
                       :doc "For writing defmulti like macros. Handles optional docstrings and\n  attribute maps for a name to be defined in a list of macro\n  arguments.\n\n  name docstring? attr-map? dispatch options-map? "}
                      {:ns pallet.utils.multi,
                       :name multi-fn,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 111,
                       :var-type :fn,
                       :arglists ([dispatch-f
                                   {:keys [name hierarchy],
                                    :as options}]
                                  [dispatch-f]),
                       :doc "Return an anonymous multimethod function.\n  Add methods using assoc-method!."}
                      {:ns pallet.utils.multi,
                       :name dispatch-predicate,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 51,
                       :var-type :fn,
                       :arglists ([dispatch-fn
                                   {:keys [default name selector],
                                    :or {default :default,
                                         selector first}}]),
                       :doc "Return a function, that will dispatch into a method map based on\n  the method key matching a predicate function.  The predicate\n  function is obtained by calling `dispatch-fn` with `args`.  A best\n  match for multiple matches is picked using `selector`, which\n  defaults to `first`.  If no match is found, then the method with\n  the `default` key value is used."}
                      {:ns pallet.utils.multi,
                       :name multi-every-fn,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 119,
                       :var-type :fn,
                       :arglists ([dispatch-fns
                                   {:keys [name selector],
                                    :as options}]
                                  [dispatch-fns]),
                       :doc "Return an anonymous multimethod function.\n  Add methods using assoc-method!."}
                      {:ns pallet.utils.multi,
                       :name add-method,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 21,
                       :var-type :fn,
                       :arglists ([dispatch-map
                                   dispatch-val
                                   f
                                   &
                                   disp-val-fns]),
                       :doc "Adds a dispatch key and function to a dispatch map."}
                      {:ns pallet.utils.multi,
                       :name check-arity,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 160,
                       :macro true,
                       :var-type :macro,
                       :arglists ([name expected actual]),
                       :doc "Macro to throw on arity error."}
                      {:ns pallet.utils.multi,
                       :name defmethod,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 197,
                       :macro true,
                       :var-type :macro,
                       :arglists ([multifn dispatch-val args & body]),
                       :doc "Declare a method for the `multifn` multi-method, associating it with the\n  `dispatch-val` for dispatching via the multi-method's `dispatch-fn`."}
                      {:ns pallet.utils.multi,
                       :name assoc-method!,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 128,
                       :var-type :fn,
                       :arglists ([multi-fn
                                   dispatch-val
                                   f
                                   &
                                   disp-val-fns]),
                       :doc "Add a method to multi-fn, so dispatch-val will call f.\n  Mutates the multi-fn containing the method."}
                      {:private true,
                       :ns pallet.utils.multi,
                       :name multi-fn*,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 102,
                       :var-type :fn,
                       :arglists ([dispatch-fn
                                   {:keys [name selector],
                                    :as options}]),
                       :doc "Return an anonymous multimethod function.\n  Add methods using assoc-method!."}
                      {:ns pallet.utils.multi,
                       :name dispatch-every-fn,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 77,
                       :var-type :fn,
                       :arglists ([match-fns
                                   {:keys [default name selector],
                                    :or {default :default,
                                         selector first}}]),
                       :doc "Return a function, that will dispatch into a method map based on\nthe method key matching a sequence of predicate functions.  Matches\nmay be sorted to pick the best match."}
                      {:ns pallet.utils.multi,
                       :name defmulti,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 170,
                       :macro true,
                       :var-type :macro,
                       :arglists [[name
                                   docstring?
                                   attr-map?
                                   dispatch-fn
                                   {:keys [default selector]}]],
                       :doc "Declare a multimethod with a predicate based dispatch function.\n  The `dispatch-fn` argument must be a function returning a single\n  argument predicate, which will be passed each method's\n  `dispatch-val`.  `selector`, if passed, will be used to pick amongst\n  multiple matches.  If no match is found using `dispatch-fn`, the the\n  method with the `default` key value is used.  This does not have\n  `defonce` semantics."}
                      {:ns pallet.utils.multi,
                       :name dispatch-map,
                       :file "pallet/utils/multi.clj",
                       :column 1,
                       :line 12,
                       :var-type :fn,
                       :arglists ([dispatch-f]),
                       :doc "Return a dispatch map.  The map contains :dispatch-fn and :methods\n  keys. The dispatch-f must be a function that will be called with the\n  the methods as the first argument, and the arguments to dispatch as\n  the second."}),
               :ns-name pallet.utils.multi,
               :doc "Generalised multi-methods.\n\nDefines a defmulti and defmethod macros as something similar to the\ncore defmethod/defmulti macros, except dispatch is via a general\npredicate rather than via isa?."}
              {:vars ({:ns pallet.utils.rex-map,
                       :name RexMap,
                       :file "pallet/utils/rex_map.clj",
                       :column 1,
                       :line 18,
                       :var-type :var,
                       :doc "A result exception map."}
                      {:var-type :fn,
                       :ns pallet.utils.rex-map,
                       :name merge-rex-maps,
                       :file "pallet/utils/rex_map.clj",
                       :column 1,
                       :line 23,
                       :arglists ([m m2 exception-message] [m m2]),
                       :doc "Merge result exception maps.\n\n## Function Signatures\n\n  - (maybe RexMap) (maybe RexMap) (maybe String) -> RexMap\n  - (maybe RexMap) (maybe RexMap) -> RexMap",
                       :sig [[(maybe
                               {(optional-key :exception) java.lang.Throwable,
                                Keyword [Any]})
                              (maybe
                               {(optional-key :exception) java.lang.Throwable,
                                Keyword [Any]})
                              (maybe java.lang.String)
                              :-
                              {(optional-key :exception) java.lang.Throwable,
                               Keyword [Any]}]
                             [(maybe
                               {(optional-key :exception) java.lang.Throwable,
                                Keyword [Any]})
                              (maybe
                               {(optional-key :exception) java.lang.Throwable,
                                Keyword [Any]})
                              :-
                              {(optional-key :exception) java.lang.Throwable,
                               Keyword [Any]}]]}),
               :ns-name pallet.utils.rex-map}
              {:vars ({:ns pallet.utils.schema,
                       :name check-keys,
                       :file "pallet/utils/schema.clj",
                       :column 1,
                       :line 12,
                       :var-type :fn,
                       :arglists ([m keys spec msg])}
                      {:ns pallet.utils.schema,
                       :name update-in-both,
                       :file "pallet/utils/schema.clj",
                       :column 1,
                       :line 16,
                       :var-type :fn,
                       :arglists ([both-schema index f & args]),
                       :doc "Update a schema inside a (both) schema."}
                      {:ns pallet.utils.schema,
                       :name validate,
                       :file "pallet/utils/schema.clj",
                       :column 1,
                       :line 6,
                       :var-type :fn,
                       :arglists ([spec value msg])}
                      {:ns pallet.utils.schema,
                       :name extend-primitive,
                       :file "pallet/utils/schema.clj",
                       :column 3,
                       :line 25,
                       :macro true,
                       :var-type :macro,
                       :arglists ([cast-sym class-sym class-explain])}),
               :ns-name pallet.utils.schema,
               :doc "Utils around schema"}
              {:vars ({:ns pallet.utils,
                       :name map-arg-and-ref,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 302,
                       :var-type :fn,
                       :arglists ([arg]),
                       :doc "Ensure a symbolic argument, arg, can be referred to.\n  Returns a tuple with a modifed argument and an argument reference."}
                      {:ns pallet.utils,
                       :name forward-to-script-lib,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 208,
                       :macro true,
                       :var-type :macro,
                       :arglists ([& symbols]),
                       :doc "Forward a script to the new script lib"}
                      {:ns pallet.utils,
                       :name first-existing-file,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 335,
                       :var-type :fn,
                       :tag java.io.File,
                       :arglists ([root filenames]),
                       :doc "Return the first file that exists.  Each name in filenames is\n  tested under root for existence.  Returns a java.io.File."}
                      {:ns pallet.utils,
                       :name base64-md5,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 187,
                       :var-type :fn,
                       :arglists ([unsafe-id]),
                       :doc "Computes the base64 encoding of the md5 of a string"}
                      {:ns pallet.utils,
                       :name pprint-lines,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 13,
                       :var-type :fn,
                       :arglists ([s]),
                       :doc "Pretty print a multiline string"}
                      {:ns pallet.utils,
                       :name map-seq,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 168,
                       :var-type :fn,
                       :arglists ([m]),
                       :doc "Given an argument, returns the argument, or nil if passed an empty map."}
                      {:ns pallet.utils,
                       :name first-line,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 35,
                       :var-type :fn,
                       :arglists ([s]),
                       :doc "Return the first line of a string."}
                      {:ns pallet.utils,
                       :name maybe-assoc,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 151,
                       :var-type :fn,
                       :arglists ([m k v] [m k v & key-vals]),
                       :doc "'Assoc a value in an associative structure, where k is a key and v is the\nvalue to assoc. The assoc only occurs if the value is non-nil."}
                      {:ns pallet.utils,
                       :name count-values,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 327,
                       :var-type :fn,
                       :arglists ([s]),
                       :doc "Take a sequence, and returns a map with the count of each value."}
                      {:ns pallet.utils,
                       :name tmpdir,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 85,
                       :var-type :fn,
                       :arglists ([]),
                       :doc "Create a temporary directory."}
                      {:ns pallet.utils,
                       :name dissoc-if-empty,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 130,
                       :var-type :fn,
                       :arglists ([m key]),
                       :doc "Like clojure.core/dissoc, except it only dissoc's if the value at the\n   keyword is nil."}
                      {:ns pallet.utils,
                       :name obfuscate,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 262,
                       :var-type :fn,
                       :arglists ([pw]),
                       :doc "Obfuscate a password, by replacing every character by an asterisk."}
                      {:ns pallet.utils,
                       :name local-env,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 236,
                       :macro true,
                       :var-type :macro,
                       :arglists ([]),
                       :doc "Return clojure's local environment as a map of keyword value pairs."}
                      {:ns pallet.utils,
                       :name deep-merge,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 253,
                       :var-type :fn,
                       :arglists ([& ms]),
                       :doc "Recursively merge maps."}
                      {:ns pallet.utils,
                       :name fwd-to-configure,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 215,
                       :macro true,
                       :var-type :macro,
                       :arglists ([name & [as-name & _]])}
                      {:ns pallet.utils,
                       :name total-order-merge,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 267,
                       :var-type :fn,
                       :arglists ([& seqs]),
                       :doc "Merge the `seqs` sequences so that the ordering of the elements in result is\n  the same as the ordering of elements present in each of the specified\n  sequences.  Throws an exception if no ordering can be found that satisfies the\n  ordering in all the `seqs`."}
                      {:ns pallet.utils,
                       :name multi-fn?,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 345,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate for a multi-method."}
                      {:ns pallet.utils,
                       :name pipe,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 173,
                       :macro true,
                       :var-type :macro,
                       :arglists ([& forms]),
                       :doc "Build a session processing pipeline from the specified forms."}
                      {:ns pallet.utils,
                       :name with-temporary,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 92,
                       :macro true,
                       :var-type :macro,
                       :arglists ([bindings & body]),
                       :doc "A block scope allowing multiple bindings to expressions.  Each binding will\n   have the member function `delete` called on it."}
                      {:ns pallet.utils,
                       :name safe-id,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 312,
                       :var-type :fn,
                       :arglists ([unsafe-id]),
                       :doc "Computes a configuration and filesystem safe identifier corresponding to a\n  potentially unsafe ID"}
                      {:ns pallet.utils,
                       :name log-multiline,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 245,
                       :macro true,
                       :var-type :macro,
                       :arglists ([level-kw fmt string]),
                       :doc "Log a multiline string in multiple log lines"}
                      {:ns pallet.utils,
                       :name dissoc-keys,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 125,
                       :var-type :fn,
                       :arglists ([m keys]),
                       :doc "Like clojure.core/dissoc, except it takes a vector of keys to remove"}
                      {:ns pallet.utils,
                       :name middleware,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 198,
                       :macro true,
                       :var-type :macro,
                       :arglists ([& forms]),
                       :doc "Build a middleware processing pipeline from the specified forms.\n   The result is a middleware."}
                      {:ns pallet.utils,
                       :name compare-and-swap!,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 221,
                       :var-type :fn,
                       :arglists ([a f & args]),
                       :doc "Compare and swap, returning old and new values"}
                      {:ns pallet.utils,
                       :name as-string,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 27,
                       :var-type :fn,
                       :arglists ([arg]),
                       :doc "Return the string value of the argument."}
                      {:ns pallet.utils,
                       :name find-var-with-require,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 44,
                       :var-type :fn,
                       :arglists ([sym] [ns sym]),
                       :doc "Find the var for the given namespace and symbol. If the namespace does\n   not exist, then it will be required.\n       (find-var-with-require 'my.ns 'a-symbol)\n       (find-var-with-require 'my.ns/a-symbol)\n\n   If the namespace exists, but can not be loaded, and exception is thrown.  If\n   the namespace is loaded, but the symbol is not found, then nil is returned."}
                      {:ns pallet.utils,
                       :name apply-map,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 40,
                       :macro true,
                       :var-type :macro,
                       :arglists ([& args])}
                      {:ns pallet.utils,
                       :name maybe-update-in,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 138,
                       :var-type :fn,
                       :arglists ([m ks f & args]),
                       :doc "'Updates' a value in a nested associative structure, where ks is a\n  sequence of keys and f is a function that will take the old value\n  and any supplied args and return the new value, and returns a new\n  nested structure.  If any levels do not exist, hash-maps will be\n  created only if the update function returns a non-nil value. If\n  the update function returns nil, the map is returned unmodified."}
                      {:ns pallet.utils,
                       :name with-temp-file,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 71,
                       :macro true,
                       :var-type :macro,
                       :arglists ([[varname content] & body]),
                       :doc "Create a block where `varname` is a temporary `File` containing `content`."}
                      {:ns pallet.utils,
                       :name tmpfile,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 80,
                       :var-type :fn,
                       :arglists ([] [dir]),
                       :doc "Create a temporary file"}
                      {:ns pallet.utils,
                       :name with-redef,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 230,
                       :macro true,
                       :var-type :macro,
                       :arglists ([[& bindings] & body])}
                      {:ns pallet.utils,
                       :name conj-distinct,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 297,
                       :var-type :fn,
                       :arglists ([coll arg]),
                       :doc "Conj, returning a vector, removing duplicates in the resulting vector."}
                      {:ns pallet.utils,
                       :name underscore,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 23,
                       :var-type :fn,
                       :arglists ([s])}
                      {:ns pallet.utils,
                       :name map-with-keys-as-symbols,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 108,
                       :var-type :fn,
                       :arglists ([m]),
                       :doc "Produce a map that is the same as m, but with all keys are converted to\n  symbols."}
                      {:ns pallet.utils,
                       :name count-by,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 318,
                       :var-type :fn,
                       :arglists ([key-fn s]),
                       :doc "Take a sequence and a key function, and returns a map with the\n  count of each key."}
                      {:ns pallet.utils,
                       :name quoted,
                       :file "pallet/utils.clj",
                       :column 1,
                       :line 18,
                       :var-type :fn,
                       :arglists ([s]),
                       :doc "Return the string value of the argument in quotes."}),
               :ns-name pallet.utils,
               :doc "Utilities used across pallet."}
              {:vars ({:ns pallet.version-dispatch,
                       :name defmethod-version,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :line 106,
                       :macro true,
                       :var-type :macro,
                       :arglists ([multi-version
                                   {:keys [os os-version version],
                                    :as dispatch-value}
                                   [& args]
                                   &
                                   body]),
                       :doc "Adds a method to the specified defmulti-version function for the specified\n  `dispatch-value`."}
                      {:ns pallet.version-dispatch,
                       :name defmulti-version,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :line 80,
                       :macro true,
                       :var-type :macro,
                       :arglists [[name
                                   [os
                                    os-version
                                    version
                                    &
                                    args
                                    :as
                                    dispatch]
                                   &
                                   {:keys [hierarchy]}]],
                       :doc "Defines a multi-version function used to abstract over an operating system\nhierarchy, where dispatch includes an optional `os-version`. The `version`\nrefers to a software package version of some sort, on the specified `os` and\n`os-version`."}
                      {:ns pallet.version-dispatch,
                       :name multi-version-selector,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :internal true,
                       :line 60,
                       :var-type :fn,
                       :arglists ([methods hierarchy])}
                      {:ns pallet.version-dispatch,
                       :name hierarchy-vals,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :internal true,
                       :line 26,
                       :var-type :fn,
                       :arglists ([hierarchy]),
                       :doc "Returns all values in a hierarchy, whether parents or children."}
                      {:ns pallet.version-dispatch,
                       :name defmulti-version-plan,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :line 113,
                       :macro true,
                       :var-type :macro,
                       :arglists [[name
                                   [session
                                    version
                                    &
                                    args
                                    :as
                                    dispatch]
                                   &
                                   {:keys [hierarchy]}]],
                       :doc "Defines a multi-version function used to abstract over an operating system\nhierarchy, where dispatch includes an optional `os-version`. The `version`\nrefers to a software package version of some sort, on the specified `os` and\n`os-version`."}
                      {:ns pallet.version-dispatch,
                       :name defmethod-version-plan,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :line 143,
                       :macro true,
                       :var-type :macro,
                       :arglists ([multi-version
                                   {:keys [os os-version version],
                                    :as dispatch-value}
                                   [& args]
                                   &
                                   body]),
                       :doc "Adds a method to the specified defmulti-version function for the specified\n  `dispatch-value`."}
                      {:ns pallet.version-dispatch,
                       :name os-matches?,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :line 71,
                       :var-type :fn,
                       :arglists ([k os])}
                      {:ns pallet.version-dispatch,
                       :name component-version-matches,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :line 77,
                       :var-type :fn,
                       :arglists ([k version])}
                      {:ns pallet.version-dispatch,
                       :name os-map-lookup,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :line 158,
                       :var-type :fn,
                       :arglists ([os-map])}
                      {:ns pallet.version-dispatch,
                       :name os-map,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :line 150,
                       :var-type :fn,
                       :arglists ([{:as os-value-pairs}]),
                       :doc "Construct an os version map. The keys should be maps with :os-family\nand :os-version keys. The :os-family value should be take from the\n`os-hierarchy`. The :os-version should be a version vector, or a version range\nvector."}
                      {:ns pallet.version-dispatch,
                       :name os-version-matches,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :line 74,
                       :var-type :fn,
                       :arglists ([k os-version])}
                      {:ns pallet.version-dispatch,
                       :name dispatch-version,
                       :file "pallet/version_dispatch.clj",
                       :column 1,
                       :internal true,
                       :line 34,
                       :var-type :fn,
                       :arglists ([sym
                                   os
                                   os-version
                                   version
                                   args
                                   hierarchy
                                   methods])}),
               :ns-name pallet.version-dispatch,
               :doc "Dispatch that is version aware.\n\nA version is a dotted string, e.g. \"1.0.3\", which is represented as a vector\n`[1 0 3]`.\n\nA version specification is either a version vector, which matches a single\nversion (and all point versions thereof), or a vector of two elements,\nspecifying an inclusive version range. A nil in the version vector signifies an\nopen end to the range.\n\nThe basic idea is that you wish to dispatch on hierarchy where the dispatched\ndata may provide a version."}
              {:vars ({:ns pallet.versions,
                       :name version-matches?,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 112,
                       :var-type :fn,
                       :arglists ([version spec]),
                       :doc "Predicate to test if a version matches a version spec. A version spec is a\n   version, or two (possibly nil) versions in a vector, to specify a version\n   range."}
                      {:ns pallet.versions,
                       :name as-version-vector,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 66,
                       :var-type :fn,
                       :arglists ([version]),
                       :doc "Take a version, as either a string or a version vector, and returns a\nversion vector."}
                      {:ns pallet.versions,
                       :name version-vector?,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 28,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate to check for a version vector."}
                      {:ns pallet.versions,
                       :name version-spec?,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 56,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate to check for a version spec."}
                      {:ns pallet.versions,
                       :name read-version-number,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 7,
                       :var-type :fn,
                       :arglists ([s]),
                       :doc "Read a version number from a string, ignoring alphabetic chars."}
                      {:ns pallet.versions,
                       :name as-version-string,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 80,
                       :var-type :fn,
                       :arglists ([version]),
                       :doc "Take a version, as either a string or a version vector, and returns a\nversion string."}
                      {:ns pallet.versions,
                       :name version-range?,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 47,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate to check for a version range."}
                      {:ns pallet.versions,
                       :name version-string,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 72,
                       :var-type :fn,
                       :arglists ([version-vector]),
                       :doc "Convert a vector of version numbers to a dotted version string.\nE.g.,\n    (version-vector [1 2]) => \"1.2\""}
                      {:private true,
                       :ns pallet.versions,
                       :name version-matches-version?,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 101,
                       :var-type :fn,
                       :arglists ([version spec-version]),
                       :doc "Does the version match a single version spec"}
                      {:ns pallet.versions,
                       :name nilable-version-vector?,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 37,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate to check for a version vector."}
                      {:ns pallet.versions,
                       :name version-less,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 86,
                       :var-type :fn,
                       :arglists ([v1 v2]),
                       :doc "Compare two version vectors."}
                      {:ns pallet.versions,
                       :name nilable-version-spec?,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 61,
                       :var-type :fn,
                       :arglists ([x]),
                       :doc "Predicate to check for a version spec."}
                      {:ns pallet.versions,
                       :name version-vector,
                       :file "pallet/versions.clj",
                       :column 1,
                       :line 16,
                       :var-type :fn,
                       :arglists ([version-string]),
                       :doc "Convert a dotted (or dashed) version string to a vector of version numbers.\nE.g.,\n    (version-vector \"1.2\") => [1 2]"}),
               :ns-name pallet.versions,
               :doc "Version handling for pallet"}),
 :dependencies ([org.clojure/clojure "1.6.0"]
                [org.clojure/tools.macro "0.1.2"]
                [org.clojure/algo.monads "0.1.0"]
                [org.clojure/core.async
                 "0.1.267.0-0d7780-alpha"
                 :exclusions
                 ([org.clojure/clojurescript])]
                [com.palletops/api-builder "0.1.5"]
                [com.palletops/chiba "0.2.0"]
                [com.palletops/log-config "0.1.3"]
                [com.palletops/pallet-common "0.4.0"]
                [com.palletops/pallet-repl
                 "0.8.0-beta.2"
                 :exclusions
                 ([com.palletops/pallet])]
                [com.palletops/script-exec "0.4.1-SNAPSHOT"]
                [com.palletops/stevedore "0.8.0-beta.6"]
                [enlive/enlive
                 "1.0.1"
                 :exclusions
                 ([org.clojure/clojure])]
                [pallet-map-merge/pallet-map-merge "0.1.0"]
                [prismatic/schema "0.2.1"]
                [org.flatland/useful "0.10.3"]
                [commons-codec/commons-codec "1.4"]
                [com.palletops/docudata "0.1.0-SNAPSHOT"]),
 :description "DevOps for the JVM.\n\nPallet is a platform for agile and programmatic automation of infrastructure\nin the cloud, on server racks or directly on virtual machines. Pallet\nprovides cloud provider and operating system independence, and allows for an\nunprecedented level of customization.",
 :version "0.9.0-SNAPSHOT",
 :name "pallet",
 :group "com.palletops"}
