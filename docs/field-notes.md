# Field Notes

`amber-svc-router-gate` is easiest to review by starting with the fixture, not the prose.

The domain cases cover `queue pressure`, `retry load`, `worker slack`, and `session drift`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`recovery` tells me the happy path still works. `stale` tells me whether the guardrail still has teeth.

The point is not to make the repository bigger. The point is to make the important judgment testable.
