// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.outputs;

import com.pulumi.alicloud.actiontrail.outputs.GetTrailsActiontrail;
import com.pulumi.alicloud.actiontrail.outputs.GetTrailsTrail;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTrailsResult {
    /**
     * @return Field `actiontrails` has been deprecated from version 1.95.0. Use `trails` instead.&#34;
     * 
     * @deprecated
     * Field &#39;actiontrails&#39; has been deprecated from version 1.95.0. Use &#39;trails&#39; instead.
     * 
     */
    @Deprecated /* Field 'actiontrails' has been deprecated from version 1.95.0. Use 'trails' instead. */
    private List<GetTrailsActiontrail> actiontrails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of ActionTrail Trail ids. It is the same as trail name.
     * 
     */
    private List<String> ids;
    private @Nullable Boolean includeOrganizationTrail;
    private @Nullable Boolean includeShadowTrails;
    private @Nullable String nameRegex;
    /**
     * @return A list of trail names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return The status of the ActionTrail Trail.
     * 
     */
    private @Nullable String status;
    /**
     * @return A list of ActionTrail Trails. Each element contains the following attributes:
     * 
     */
    private List<GetTrailsTrail> trails;

    private GetTrailsResult() {}
    /**
     * @return Field `actiontrails` has been deprecated from version 1.95.0. Use `trails` instead.&#34;
     * 
     * @deprecated
     * Field &#39;actiontrails&#39; has been deprecated from version 1.95.0. Use &#39;trails&#39; instead.
     * 
     */
    @Deprecated /* Field 'actiontrails' has been deprecated from version 1.95.0. Use 'trails' instead. */
    public List<GetTrailsActiontrail> actiontrails() {
        return this.actiontrails;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of ActionTrail Trail ids. It is the same as trail name.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<Boolean> includeOrganizationTrail() {
        return Optional.ofNullable(this.includeOrganizationTrail);
    }
    public Optional<Boolean> includeShadowTrails() {
        return Optional.ofNullable(this.includeShadowTrails);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of trail names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The status of the ActionTrail Trail.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return A list of ActionTrail Trails. Each element contains the following attributes:
     * 
     */
    public List<GetTrailsTrail> trails() {
        return this.trails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrailsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTrailsActiontrail> actiontrails;
        private String id;
        private List<String> ids;
        private @Nullable Boolean includeOrganizationTrail;
        private @Nullable Boolean includeShadowTrails;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String status;
        private List<GetTrailsTrail> trails;
        public Builder() {}
        public Builder(GetTrailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actiontrails = defaults.actiontrails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.includeOrganizationTrail = defaults.includeOrganizationTrail;
    	      this.includeShadowTrails = defaults.includeShadowTrails;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.trails = defaults.trails;
        }

        @CustomType.Setter
        public Builder actiontrails(List<GetTrailsActiontrail> actiontrails) {
            this.actiontrails = Objects.requireNonNull(actiontrails);
            return this;
        }
        public Builder actiontrails(GetTrailsActiontrail... actiontrails) {
            return actiontrails(List.of(actiontrails));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder includeOrganizationTrail(@Nullable Boolean includeOrganizationTrail) {
            this.includeOrganizationTrail = includeOrganizationTrail;
            return this;
        }
        @CustomType.Setter
        public Builder includeShadowTrails(@Nullable Boolean includeShadowTrails) {
            this.includeShadowTrails = includeShadowTrails;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder trails(List<GetTrailsTrail> trails) {
            this.trails = Objects.requireNonNull(trails);
            return this;
        }
        public Builder trails(GetTrailsTrail... trails) {
            return trails(List.of(trails));
        }
        public GetTrailsResult build() {
            final var _resultValue = new GetTrailsResult();
            _resultValue.actiontrails = actiontrails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.includeOrganizationTrail = includeOrganizationTrail;
            _resultValue.includeShadowTrails = includeShadowTrails;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            _resultValue.trails = trails;
            return _resultValue;
        }
    }
}
