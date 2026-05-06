# Review Journal

I treated `amber-svc-router-gate` as a project where the smallest useful behavior should still be inspectable.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 130, lane `watch`
- `stress`: `retry load`, score 137, lane `watch`
- `edge`: `worker slack`, score 155, lane `ship`
- `recovery`: `session drift`, score 172, lane `ship`
- `stale`: `queue pressure`, score 128, lane `watch`

## Note

This file is intentionally plain so the fixture remains the source of truth.
