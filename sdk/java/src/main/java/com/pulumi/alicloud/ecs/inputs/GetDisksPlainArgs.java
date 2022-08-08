// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.alicloud.ecs.inputs.GetDisksOperationLock;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDisksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDisksPlainArgs Empty = new GetDisksPlainArgs();

    @Import(name="additionalAttributes")
    private @Nullable List<String> additionalAttributes;

    public Optional<List<String>> additionalAttributes() {
        return Optional.ofNullable(this.additionalAttributes);
    }

    @Import(name="autoSnapshotPolicyId")
    private @Nullable String autoSnapshotPolicyId;

    public Optional<String> autoSnapshotPolicyId() {
        return Optional.ofNullable(this.autoSnapshotPolicyId);
    }

    /**
     * Availability zone of the disk.
     * 
     * @deprecated
     * Field &#39;availability_zone&#39; has been deprecated from provider version 1.122.0. New field &#39;zone_id&#39; instead
     * 
     */
    @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead */
    @Import(name="availabilityZone")
    private @Nullable String availabilityZone;

    /**
     * @return Availability zone of the disk.
     * 
     * @deprecated
     * Field &#39;availability_zone&#39; has been deprecated from provider version 1.122.0. New field &#39;zone_id&#39; instead
     * 
     */
    @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead */
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * Disk category. Possible values: `cloud` (basic cloud disk), `cloud_efficiency` (ultra cloud disk), `ephemeral_ssd` (local SSD cloud disk), `cloud_ssd` (SSD cloud disk), and `cloud_essd` (ESSD cloud disk).
     * 
     */
    @Import(name="category")
    private @Nullable String category;

    /**
     * @return Disk category. Possible values: `cloud` (basic cloud disk), `cloud_efficiency` (ultra cloud disk), `ephemeral_ssd` (local SSD cloud disk), `cloud_ssd` (SSD cloud disk), and `cloud_essd` (ESSD cloud disk).
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }

    @Import(name="deleteAutoSnapshot")
    private @Nullable Boolean deleteAutoSnapshot;

    public Optional<Boolean> deleteAutoSnapshot() {
        return Optional.ofNullable(this.deleteAutoSnapshot);
    }

    @Import(name="deleteWithInstance")
    private @Nullable Boolean deleteWithInstance;

    public Optional<Boolean> deleteWithInstance() {
        return Optional.ofNullable(this.deleteWithInstance);
    }

    @Import(name="diskName")
    private @Nullable String diskName;

    public Optional<String> diskName() {
        return Optional.ofNullable(this.diskName);
    }

    @Import(name="diskType")
    private @Nullable String diskType;

    public Optional<String> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    @Import(name="dryRun")
    private @Nullable Boolean dryRun;

    public Optional<Boolean> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    @Import(name="enableAutoSnapshot")
    private @Nullable Boolean enableAutoSnapshot;

    public Optional<Boolean> enableAutoSnapshot() {
        return Optional.ofNullable(this.enableAutoSnapshot);
    }

    @Import(name="enableAutomatedSnapshotPolicy")
    private @Nullable Boolean enableAutomatedSnapshotPolicy;

    public Optional<Boolean> enableAutomatedSnapshotPolicy() {
        return Optional.ofNullable(this.enableAutomatedSnapshotPolicy);
    }

    @Import(name="enableShared")
    private @Nullable Boolean enableShared;

    public Optional<Boolean> enableShared() {
        return Optional.ofNullable(this.enableShared);
    }

    /**
     * Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
     * 
     */
    @Import(name="encrypted")
    private @Nullable String encrypted;

    /**
     * @return Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
     * 
     */
    public Optional<String> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * A list of disks IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of disks IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Filter the results by the specified ECS instance ID.
     * 
     */
    @Import(name="instanceId")
    private @Nullable String instanceId;

    /**
     * @return Filter the results by the specified ECS instance ID.
     * 
     */
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    @Import(name="kmsKeyId")
    private @Nullable String kmsKeyId;

    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * A regex string to filter results by disk name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by disk name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="operationLocks")
    private @Nullable List<GetDisksOperationLock> operationLocks;

    public Optional<List<GetDisksOperationLock>> operationLocks() {
        return Optional.ofNullable(this.operationLocks);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    @Import(name="paymentType")
    private @Nullable String paymentType;

    public Optional<String> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    @Import(name="portable")
    private @Nullable Boolean portable;

    public Optional<Boolean> portable() {
        return Optional.ofNullable(this.portable);
    }

    /**
     * The Id of resource group which the disk belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The Id of resource group which the disk belongs.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable String snapshotId;

    /**
     * @return Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
     * 
     */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A map of tags assigned to the disks. It must be in the format:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.ecs.EcsFunctions;
     * import com.pulumi.alicloud.ecs.inputs.GetDisksArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var disksDs = EcsFunctions.getDisks(GetDisksArgs.builder()
     *             .tags(Map.ofEntries(
     *                 Map.entry(&#34;tagKey1&#34;, &#34;tagValue1&#34;),
     *                 Map.entry(&#34;tagKey2&#34;, &#34;tagValue2&#34;)
     *             ))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    /**
     * @return A map of tags assigned to the disks. It must be in the format:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.ecs.EcsFunctions;
     * import com.pulumi.alicloud.ecs.inputs.GetDisksArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var disksDs = EcsFunctions.getDisks(GetDisksArgs.builder()
     *             .tags(Map.ofEntries(
     *                 Map.entry(&#34;tagKey1&#34;, &#34;tagValue1&#34;),
     *                 Map.entry(&#34;tagKey2&#34;, &#34;tagValue2&#34;)
     *             ))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Disk type. Possible values: `system` and `data`.
     * 
     * @deprecated
     * Field &#39;type&#39; has been deprecated from provider version 1.122.0. New field &#39;disk_type&#39; instead.
     * 
     */
    @Deprecated /* Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead. */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Disk type. Possible values: `system` and `data`.
     * 
     * @deprecated
     * Field &#39;type&#39; has been deprecated from provider version 1.122.0. New field &#39;disk_type&#39; instead.
     * 
     */
    @Deprecated /* Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead. */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="zoneId")
    private @Nullable String zoneId;

    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetDisksPlainArgs() {}

    private GetDisksPlainArgs(GetDisksPlainArgs $) {
        this.additionalAttributes = $.additionalAttributes;
        this.autoSnapshotPolicyId = $.autoSnapshotPolicyId;
        this.availabilityZone = $.availabilityZone;
        this.category = $.category;
        this.deleteAutoSnapshot = $.deleteAutoSnapshot;
        this.deleteWithInstance = $.deleteWithInstance;
        this.diskName = $.diskName;
        this.diskType = $.diskType;
        this.dryRun = $.dryRun;
        this.enableAutoSnapshot = $.enableAutoSnapshot;
        this.enableAutomatedSnapshotPolicy = $.enableAutomatedSnapshotPolicy;
        this.enableShared = $.enableShared;
        this.encrypted = $.encrypted;
        this.ids = $.ids;
        this.instanceId = $.instanceId;
        this.kmsKeyId = $.kmsKeyId;
        this.nameRegex = $.nameRegex;
        this.operationLocks = $.operationLocks;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.paymentType = $.paymentType;
        this.portable = $.portable;
        this.resourceGroupId = $.resourceGroupId;
        this.snapshotId = $.snapshotId;
        this.status = $.status;
        this.tags = $.tags;
        this.type = $.type;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDisksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDisksPlainArgs $;

        public Builder() {
            $ = new GetDisksPlainArgs();
        }

        public Builder(GetDisksPlainArgs defaults) {
            $ = new GetDisksPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalAttributes(@Nullable List<String> additionalAttributes) {
            $.additionalAttributes = additionalAttributes;
            return this;
        }

        public Builder additionalAttributes(String... additionalAttributes) {
            return additionalAttributes(List.of(additionalAttributes));
        }

        public Builder autoSnapshotPolicyId(@Nullable String autoSnapshotPolicyId) {
            $.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * @param availabilityZone Availability zone of the disk.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;availability_zone&#39; has been deprecated from provider version 1.122.0. New field &#39;zone_id&#39; instead
         * 
         */
        @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead */
        public Builder availabilityZone(@Nullable String availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param category Disk category. Possible values: `cloud` (basic cloud disk), `cloud_efficiency` (ultra cloud disk), `ephemeral_ssd` (local SSD cloud disk), `cloud_ssd` (SSD cloud disk), and `cloud_essd` (ESSD cloud disk).
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable String category) {
            $.category = category;
            return this;
        }

        public Builder deleteAutoSnapshot(@Nullable Boolean deleteAutoSnapshot) {
            $.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }

        public Builder deleteWithInstance(@Nullable Boolean deleteWithInstance) {
            $.deleteWithInstance = deleteWithInstance;
            return this;
        }

        public Builder diskName(@Nullable String diskName) {
            $.diskName = diskName;
            return this;
        }

        public Builder diskType(@Nullable String diskType) {
            $.diskType = diskType;
            return this;
        }

        public Builder dryRun(@Nullable Boolean dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        public Builder enableAutoSnapshot(@Nullable Boolean enableAutoSnapshot) {
            $.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }

        public Builder enableAutomatedSnapshotPolicy(@Nullable Boolean enableAutomatedSnapshotPolicy) {
            $.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            return this;
        }

        public Builder enableShared(@Nullable Boolean enableShared) {
            $.enableShared = enableShared;
            return this;
        }

        /**
         * @param encrypted Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable String encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param ids A list of disks IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of disks IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param instanceId Filter the results by the specified ECS instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by disk name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder operationLocks(@Nullable List<GetDisksOperationLock> operationLocks) {
            $.operationLocks = operationLocks;
            return this;
        }

        public Builder operationLocks(GetDisksOperationLock... operationLocks) {
            return operationLocks(List.of(operationLocks));
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        public Builder paymentType(@Nullable String paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        public Builder portable(@Nullable Boolean portable) {
            $.portable = portable;
            return this;
        }

        /**
         * @param resourceGroupId The Id of resource group which the disk belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param snapshotId Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable String snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param status Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the disks. It must be in the format:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.alicloud.ecs.EcsFunctions;
         * import com.pulumi.alicloud.ecs.inputs.GetDisksArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         final var disksDs = EcsFunctions.getDisks(GetDisksArgs.builder()
         *             .tags(Map.ofEntries(
         *                 Map.entry(&#34;tagKey1&#34;, &#34;tagValue1&#34;),
         *                 Map.entry(&#34;tagKey2&#34;, &#34;tagValue2&#34;)
         *             ))
         *             .build());
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param type Disk type. Possible values: `system` and `data`.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;type&#39; has been deprecated from provider version 1.122.0. New field &#39;disk_type&#39; instead.
         * 
         */
        @Deprecated /* Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead. */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public Builder zoneId(@Nullable String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetDisksPlainArgs build() {
            return $;
        }
    }

}
