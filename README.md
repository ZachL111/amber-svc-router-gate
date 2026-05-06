# amber-svc-router-gate

`amber-svc-router-gate` explores backend services with a small Kotlin codebase and local fixtures. The technical goal is to design a Kotlin verification harness for router systems, covering stream reduction, windowed input fixtures, and failure-oriented tests.

## Use Case

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how queue pressure and worker slack should influence a review result.

## Amber Svc Router Gate Review Notes

Start with `session drift` and `queue pressure`. Those cases create the widest score spread in this repo, so they are the best quick check when the model changes.

## Highlights

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/amber-svc-router-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `session drift` and `queue pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Code Layout

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `queue pressure`, `retry load`, `worker slack`, and `session drift`.

The Kotlin addition stays small enough to inspect in one sitting.

## Run The Check

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Regression Path

The same command runs the local verification path. The highest-scoring domain case is `recovery` at 172, which lands in `ship`. The most cautious case is `stale` at 128, which lands in `watch`.

## Future Work

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
