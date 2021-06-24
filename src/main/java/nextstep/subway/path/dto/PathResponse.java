package nextstep.subway.path.dto;

import nextstep.subway.station.domain.Station;

import java.util.List;

public class PathResponse {

    private final List<Station> stations;
    private final int distance;

    public PathResponse(List<Station> stations, int distance) {
        this.stations = stations;
        this.distance = distance;
    }

    public static PathResponse of(List<Station> stations, int distance) {
        return new PathResponse(stations, distance);
    }

    public List<Station> getStations() {
        return stations;
    }

    public int getDistance() {
        return distance;
    }
}