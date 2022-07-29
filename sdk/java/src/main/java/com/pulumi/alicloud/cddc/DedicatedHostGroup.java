// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cddc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cddc.DedicatedHostGroupArgs;
import com.pulumi.alicloud.cddc.inputs.DedicatedHostGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ApsaraDB for MyBase Dedicated Host Group resource.
 * 
 * For information about ApsaraDB for MyBase Dedicated Host Group and how to use it, see [What is Dedicated Host Group](https://www.alibabacloud.com/help/doc-detail/141455.htm).
 * 
 * &gt; **NOTE:** Available in v1.132.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ApsaraDB for MyBase Dedicated Host Group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cddc/dedicatedHostGroup:DedicatedHostGroup example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cddc/dedicatedHostGroup:DedicatedHostGroup")
public class DedicatedHostGroup extends com.pulumi.resources.CustomResource {
    /**
     * AThe policy that is used to allocate resources in the dedicated cluster. Valid values:`Evenly`,`Intensively`
     * 
     */
    @Export(name="allocationPolicy", type=String.class, parameters={})
    private Output<String> allocationPolicy;

    /**
     * @return AThe policy that is used to allocate resources in the dedicated cluster. Valid values:`Evenly`,`Intensively`
     * 
     */
    public Output<String> allocationPolicy() {
        return this.allocationPolicy;
    }
    /**
     * The CPU overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
     * 
     */
    @Export(name="cpuAllocationRatio", type=Integer.class, parameters={})
    private Output<Integer> cpuAllocationRatio;

    /**
     * @return The CPU overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
     * 
     */
    public Output<Integer> cpuAllocationRatio() {
        return this.cpuAllocationRatio;
    }
    /**
     * The name of the dedicated cluster. The name must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    @Export(name="dedicatedHostGroupDesc", type=String.class, parameters={})
    private Output</* @Nullable */ String> dedicatedHostGroupDesc;

    /**
     * @return The name of the dedicated cluster. The name must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    public Output<Optional<String>> dedicatedHostGroupDesc() {
        return Codegen.optional(this.dedicatedHostGroupDesc);
    }
    /**
     * The Disk Allocation Ratio of the Dedicated Host Group. **NOTE:** When `engine = SQLServer`, this attribute does not support to set.
     * 
     */
    @Export(name="diskAllocationRatio", type=Integer.class, parameters={})
    private Output<Integer> diskAllocationRatio;

    /**
     * @return The Disk Allocation Ratio of the Dedicated Host Group. **NOTE:** When `engine = SQLServer`, this attribute does not support to set.
     * 
     */
    public Output<Integer> diskAllocationRatio() {
        return this.diskAllocationRatio;
    }
    /**
     * Database Engine Type.The database engine of the dedicated cluster. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output<String> engine;

    /**
     * @return Database Engine Type.The database engine of the dedicated cluster. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * The policy based on which the system handles host failures. Valid values:`Auto`,`Manual`
     * 
     */
    @Export(name="hostReplacePolicy", type=String.class, parameters={})
    private Output<String> hostReplacePolicy;

    /**
     * @return The policy based on which the system handles host failures. Valid values:`Auto`,`Manual`
     * 
     */
    public Output<String> hostReplacePolicy() {
        return this.hostReplacePolicy;
    }
    /**
     * The Memory Allocation Ratio of the Dedicated Host Group.
     * 
     */
    @Export(name="memAllocationRatio", type=Integer.class, parameters={})
    private Output<Integer> memAllocationRatio;

    /**
     * @return The Memory Allocation Ratio of the Dedicated Host Group.
     * 
     */
    public Output<Integer> memAllocationRatio() {
        return this.memAllocationRatio;
    }
    /**
     * Whether to enable the feature that allows you to have OS permissions on the hosts in the dedicated cluster. Valid values: `true` and `false`.
     * **NOTE:** The `open_permission` should be `true` when `engine = &#34;SQLServer&#34;`
     * 
     */
    @Export(name="openPermission", type=Boolean.class, parameters={})
    private Output<Boolean> openPermission;

    /**
     * @return Whether to enable the feature that allows you to have OS permissions on the hosts in the dedicated cluster. Valid values: `true` and `false`.
     * **NOTE:** The `open_permission` should be `true` when `engine = &#34;SQLServer&#34;`
     * 
     */
    public Output<Boolean> openPermission() {
        return this.openPermission;
    }
    /**
     * The virtual private cloud (VPC) ID of the dedicated cluster.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The virtual private cloud (VPC) ID of the dedicated cluster.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedHostGroup(String name) {
        this(name, DedicatedHostGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedHostGroup(String name, DedicatedHostGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedHostGroup(String name, DedicatedHostGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cddc/dedicatedHostGroup:DedicatedHostGroup", name, args == null ? DedicatedHostGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DedicatedHostGroup(String name, Output<String> id, @Nullable DedicatedHostGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cddc/dedicatedHostGroup:DedicatedHostGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DedicatedHostGroup get(String name, Output<String> id, @Nullable DedicatedHostGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedHostGroup(name, id, state, options);
    }
}
