// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.alicloud.ros.outputs.GetTemplateScratchesScratchPreferenceParameter;
import com.pulumi.alicloud.ros.outputs.GetTemplateScratchesScratchSourceResource;
import com.pulumi.alicloud.ros.outputs.GetTemplateScratchesScratchSourceResourceGroup;
import com.pulumi.alicloud.ros.outputs.GetTemplateScratchesScratchSourceTag;
import com.pulumi.alicloud.ros.outputs.GetTemplateScratchesScratchStack;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTemplateScratchesScratch {
    /**
     * @return The creation time of the resource.
     * 
     */
    private final String createTime;
    /**
     * @return The description of the Template Scratch.
     * 
     */
    private final String description;
    /**
     * @return The ID of the Template Scratch.
     * 
     */
    private final String id;
    /**
     * @return The Logical ID generation strategy of the Template Scratch.
     * 
     */
    private final String logicalIdStrategy;
    /**
     * @return Priority parameter.
     * 
     */
    private final List<GetTemplateScratchesScratchPreferenceParameter> preferenceParameters;
    /**
     * @return Source resource grouping.
     * 
     */
    private final List<GetTemplateScratchesScratchSourceResourceGroup> sourceResourceGroups;
    /**
     * @return Source resource.
     * 
     */
    private final List<GetTemplateScratchesScratchSourceResource> sourceResources;
    /**
     * @return The Source label list.
     * 
     */
    private final List<GetTemplateScratchesScratchSourceTag> sourceTags;
    /**
     * @return A list of resource stacks associated with the resource scene.
     * 
     */
    private final List<GetTemplateScratchesScratchStack> stacks;
    /**
     * @return The status of the resource.
     * 
     */
    private final String status;
    /**
     * @return The ID of the Template Scratch.
     * 
     */
    private final String templateScratchId;
    /**
     * @return The type of the Template Scratch.
     * 
     */
    private final String templateScratchType;

    @CustomType.Constructor
    private GetTemplateScratchesScratch(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("logicalIdStrategy") String logicalIdStrategy,
        @CustomType.Parameter("preferenceParameters") List<GetTemplateScratchesScratchPreferenceParameter> preferenceParameters,
        @CustomType.Parameter("sourceResourceGroups") List<GetTemplateScratchesScratchSourceResourceGroup> sourceResourceGroups,
        @CustomType.Parameter("sourceResources") List<GetTemplateScratchesScratchSourceResource> sourceResources,
        @CustomType.Parameter("sourceTags") List<GetTemplateScratchesScratchSourceTag> sourceTags,
        @CustomType.Parameter("stacks") List<GetTemplateScratchesScratchStack> stacks,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("templateScratchId") String templateScratchId,
        @CustomType.Parameter("templateScratchType") String templateScratchType) {
        this.createTime = createTime;
        this.description = description;
        this.id = id;
        this.logicalIdStrategy = logicalIdStrategy;
        this.preferenceParameters = preferenceParameters;
        this.sourceResourceGroups = sourceResourceGroups;
        this.sourceResources = sourceResources;
        this.sourceTags = sourceTags;
        this.stacks = stacks;
        this.status = status;
        this.templateScratchId = templateScratchId;
        this.templateScratchType = templateScratchType;
    }

    /**
     * @return The creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the Template Scratch.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Template Scratch.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Logical ID generation strategy of the Template Scratch.
     * 
     */
    public String logicalIdStrategy() {
        return this.logicalIdStrategy;
    }
    /**
     * @return Priority parameter.
     * 
     */
    public List<GetTemplateScratchesScratchPreferenceParameter> preferenceParameters() {
        return this.preferenceParameters;
    }
    /**
     * @return Source resource grouping.
     * 
     */
    public List<GetTemplateScratchesScratchSourceResourceGroup> sourceResourceGroups() {
        return this.sourceResourceGroups;
    }
    /**
     * @return Source resource.
     * 
     */
    public List<GetTemplateScratchesScratchSourceResource> sourceResources() {
        return this.sourceResources;
    }
    /**
     * @return The Source label list.
     * 
     */
    public List<GetTemplateScratchesScratchSourceTag> sourceTags() {
        return this.sourceTags;
    }
    /**
     * @return A list of resource stacks associated with the resource scene.
     * 
     */
    public List<GetTemplateScratchesScratchStack> stacks() {
        return this.stacks;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the Template Scratch.
     * 
     */
    public String templateScratchId() {
        return this.templateScratchId;
    }
    /**
     * @return The type of the Template Scratch.
     * 
     */
    public String templateScratchType() {
        return this.templateScratchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateScratchesScratch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String id;
        private String logicalIdStrategy;
        private List<GetTemplateScratchesScratchPreferenceParameter> preferenceParameters;
        private List<GetTemplateScratchesScratchSourceResourceGroup> sourceResourceGroups;
        private List<GetTemplateScratchesScratchSourceResource> sourceResources;
        private List<GetTemplateScratchesScratchSourceTag> sourceTags;
        private List<GetTemplateScratchesScratchStack> stacks;
        private String status;
        private String templateScratchId;
        private String templateScratchType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTemplateScratchesScratch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.logicalIdStrategy = defaults.logicalIdStrategy;
    	      this.preferenceParameters = defaults.preferenceParameters;
    	      this.sourceResourceGroups = defaults.sourceResourceGroups;
    	      this.sourceResources = defaults.sourceResources;
    	      this.sourceTags = defaults.sourceTags;
    	      this.stacks = defaults.stacks;
    	      this.status = defaults.status;
    	      this.templateScratchId = defaults.templateScratchId;
    	      this.templateScratchType = defaults.templateScratchType;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder logicalIdStrategy(String logicalIdStrategy) {
            this.logicalIdStrategy = Objects.requireNonNull(logicalIdStrategy);
            return this;
        }
        public Builder preferenceParameters(List<GetTemplateScratchesScratchPreferenceParameter> preferenceParameters) {
            this.preferenceParameters = Objects.requireNonNull(preferenceParameters);
            return this;
        }
        public Builder preferenceParameters(GetTemplateScratchesScratchPreferenceParameter... preferenceParameters) {
            return preferenceParameters(List.of(preferenceParameters));
        }
        public Builder sourceResourceGroups(List<GetTemplateScratchesScratchSourceResourceGroup> sourceResourceGroups) {
            this.sourceResourceGroups = Objects.requireNonNull(sourceResourceGroups);
            return this;
        }
        public Builder sourceResourceGroups(GetTemplateScratchesScratchSourceResourceGroup... sourceResourceGroups) {
            return sourceResourceGroups(List.of(sourceResourceGroups));
        }
        public Builder sourceResources(List<GetTemplateScratchesScratchSourceResource> sourceResources) {
            this.sourceResources = Objects.requireNonNull(sourceResources);
            return this;
        }
        public Builder sourceResources(GetTemplateScratchesScratchSourceResource... sourceResources) {
            return sourceResources(List.of(sourceResources));
        }
        public Builder sourceTags(List<GetTemplateScratchesScratchSourceTag> sourceTags) {
            this.sourceTags = Objects.requireNonNull(sourceTags);
            return this;
        }
        public Builder sourceTags(GetTemplateScratchesScratchSourceTag... sourceTags) {
            return sourceTags(List.of(sourceTags));
        }
        public Builder stacks(List<GetTemplateScratchesScratchStack> stacks) {
            this.stacks = Objects.requireNonNull(stacks);
            return this;
        }
        public Builder stacks(GetTemplateScratchesScratchStack... stacks) {
            return stacks(List.of(stacks));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder templateScratchId(String templateScratchId) {
            this.templateScratchId = Objects.requireNonNull(templateScratchId);
            return this;
        }
        public Builder templateScratchType(String templateScratchType) {
            this.templateScratchType = Objects.requireNonNull(templateScratchType);
            return this;
        }        public GetTemplateScratchesScratch build() {
            return new GetTemplateScratchesScratch(createTime, description, id, logicalIdStrategy, preferenceParameters, sourceResourceGroups, sourceResources, sourceTags, stacks, status, templateScratchId, templateScratchType);
        }
    }
}
