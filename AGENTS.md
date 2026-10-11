# Burnt Grass Compatibility — validation-only

Forge 1.20.1 / Java 17; mod ID `burnt_grass_compat`.
Deterministic checks: `./gradlew verifyFast`; source/runtime gate: `./gradlew verifyFull`.
Do not deploy this validation-only addon; active wildfire owns the pack behavior.

Read [shared workspace policy](../../better-content-modpack/docs/policies/workspace.md)
and its linked testing/disposal policies. Docs-only changes use the shared document check
and `git diff --check`, not unrelated runtime builds.
