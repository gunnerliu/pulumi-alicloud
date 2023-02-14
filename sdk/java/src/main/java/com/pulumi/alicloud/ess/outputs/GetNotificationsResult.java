// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.alicloud.ess.outputs.GetNotificationsNotification;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotificationsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of notification ids.
     * 
     */
    private @Nullable List<String> ids;
    /**
     * @return A list of notifications. Each element contains the following attributes:
     * 
     */
    private List<GetNotificationsNotification> notifications;
    private @Nullable String outputFile;
    /**
     * @return ID of the scaling group.
     * 
     */
    private String scalingGroupId;

    private GetNotificationsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of notification ids.
     * 
     */
    public List<String> ids() {
        return this.ids == null ? List.of() : this.ids;
    }
    /**
     * @return A list of notifications. Each element contains the following attributes:
     * 
     */
    public List<GetNotificationsNotification> notifications() {
        return this.notifications;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return ID of the scaling group.
     * 
     */
    public String scalingGroupId() {
        return this.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable List<String> ids;
        private List<GetNotificationsNotification> notifications;
        private @Nullable String outputFile;
        private String scalingGroupId;
        public Builder() {}
        public Builder(GetNotificationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.notifications = defaults.notifications;
    	      this.outputFile = defaults.outputFile;
    	      this.scalingGroupId = defaults.scalingGroupId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(@Nullable List<String> ids) {
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder notifications(List<GetNotificationsNotification> notifications) {
            this.notifications = Objects.requireNonNull(notifications);
            return this;
        }
        public Builder notifications(GetNotificationsNotification... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder scalingGroupId(String scalingGroupId) {
            this.scalingGroupId = Objects.requireNonNull(scalingGroupId);
            return this;
        }
        public GetNotificationsResult build() {
            final var o = new GetNotificationsResult();
            o.id = id;
            o.ids = ids;
            o.notifications = notifications;
            o.outputFile = outputFile;
            o.scalingGroupId = scalingGroupId;
            return o;
        }
    }
}