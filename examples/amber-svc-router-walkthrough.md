# Amber Svc Router Gate Walkthrough

This note is the quickest way to read the extra review model in `amber-svc-router-gate`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 130 | watch |
| stress | retry load | 137 | watch |
| edge | worker slack | 155 | ship |
| recovery | session drift | 172 | ship |
| stale | queue pressure | 128 | watch |

Start with `recovery` and `stale`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `stale` becomes less cautious without a clear reason, I would inspect the drag input first.
