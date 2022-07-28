// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetBgpPeersPeer;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBgpPeersResult {
    private final @Nullable String bgpGroupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String outputFile;
    private final List<GetBgpPeersPeer> peers;
    private final @Nullable String routerId;
    private final @Nullable String status;

    @CustomType.Constructor
    private GetBgpPeersResult(
        @CustomType.Parameter("bgpGroupId") @Nullable String bgpGroupId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("peers") List<GetBgpPeersPeer> peers,
        @CustomType.Parameter("routerId") @Nullable String routerId,
        @CustomType.Parameter("status") @Nullable String status) {
        this.bgpGroupId = bgpGroupId;
        this.id = id;
        this.ids = ids;
        this.outputFile = outputFile;
        this.peers = peers;
        this.routerId = routerId;
        this.status = status;
    }

    public Optional<String> bgpGroupId() {
        return Optional.ofNullable(this.bgpGroupId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetBgpPeersPeer> peers() {
        return this.peers;
    }
    public Optional<String> routerId() {
        return Optional.ofNullable(this.routerId);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBgpPeersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bgpGroupId;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private List<GetBgpPeersPeer> peers;
        private @Nullable String routerId;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBgpPeersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpGroupId = defaults.bgpGroupId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.peers = defaults.peers;
    	      this.routerId = defaults.routerId;
    	      this.status = defaults.status;
        }

        public Builder bgpGroupId(@Nullable String bgpGroupId) {
            this.bgpGroupId = bgpGroupId;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder peers(List<GetBgpPeersPeer> peers) {
            this.peers = Objects.requireNonNull(peers);
            return this;
        }
        public Builder peers(GetBgpPeersPeer... peers) {
            return peers(List.of(peers));
        }
        public Builder routerId(@Nullable String routerId) {
            this.routerId = routerId;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetBgpPeersResult build() {
            return new GetBgpPeersResult(bgpGroupId, id, ids, outputFile, peers, routerId, status);
        }
    }
}
