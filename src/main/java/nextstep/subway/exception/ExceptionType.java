package nextstep.subway.exception;

public enum ExceptionType {
    IS_NOT_OVER_ORIGIN_DISTANCE("등록할 구간이 기존 구간보다 길거나 같을 수 없습니다."),
    IS_EXIST_BOTH_STATIONS("두 역이 모두 이미 존재합니다."),
    IS_NOT_EXIST_BOTH_STATIONS("두 역이 모두 존재하지 않습니다."),
    MUST_BE_AT_LEAST_LENGTH_ONE("길이가 최소 1 이상 이어야 합니다."),
    IS_EMPTY_LINE_NAME("지하철 노선명이 없습니다."),
    IS_EMPTY_LINE_COLOR("지하철 노선 색상이 없습니다."),
    IS_EMPTY_LINE_DISTANCE("노선사이의 거리가 없습니다."),
    IS_ADD_BETWEEN_STATION("역 사이에만 노선을 추가 할 수 있습니다."),
    NOT_FOUND_LINE("노선을 찾을 수 없습니다."),
    INVALID_STATION_ID("잘못된 지하철역 ID 입니다."),
    NOT_FOUND_LINE_STATION("해당 노선의 역을 찾을 수 없습니다."),
    CAN_NOT_DELETE_LINE_STATION("해당 노선의 지하철역을 삭제할 수 없습니다.");

    private final String message;

    ExceptionType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
