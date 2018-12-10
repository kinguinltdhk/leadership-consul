package net.kinguin.leadership.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import net.kinguin.leadership.consul.election.Vote;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ElectionMessage {
    public String status;
    public Vote vote;
    public String error;

    @Override
    public String toString() {
        return "ElectionMessage{" +
                "status='" + status + '\'' +
                ", vote=" + vote +
                ", error='" + error + '\'' +
                '}';
    }
}
