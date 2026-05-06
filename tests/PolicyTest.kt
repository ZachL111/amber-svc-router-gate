fun main() {
    val signalcase_1 = Signal(79, 79, 12, 15, 5)
    check(Policy.score(signalcase_1) == 138)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(96, 98, 26, 15, 13)
    check(Policy.score(signalcase_2) == 187)
    check(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(98, 97, 20, 9, 5)
    check(Policy.score(signalcase_3) == 214)
    check(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(49, 34, 31, 91)
    check(DomainReviewLens.score(domainReview) == 130)
    check(DomainReviewLens.lane(domainReview) == "watch")
}
