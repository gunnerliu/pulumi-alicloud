// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a ROS Stack Group resource.
 *
 * For information about ROS Stack Group and how to use it, see [What is Stack Group](https://www.alibabacloud.com/help/en/doc-detail/151333.htm).
 *
 * > **NOTE:** Available in v1.107.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.ros.StackGroup("example", {
 *     stackGroupName: "example_value",
 *     templateBody: `    {
 *     	"ROSTemplateFormatVersion": "2015-09-01"
 *     }
 *     `,
 * });
 * ```
 *
 * ## Import
 *
 * ROS Stack Group can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ros/stackGroup:StackGroup example <stack_group_name>
 * ```
 */
export class StackGroup extends pulumi.CustomResource {
    /**
     * Get an existing StackGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StackGroupState, opts?: pulumi.CustomResourceOptions): StackGroup {
        return new StackGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ros/stackGroup:StackGroup';

    /**
     * Returns true if the given object is an instance of StackGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StackGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StackGroup.__pulumiType;
    }

    /**
     * The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
     */
    public readonly accountIds!: pulumi.Output<string | undefined>;
    /**
     * The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
     */
    public readonly administrationRoleName!: pulumi.Output<string>;
    /**
     * The description of the stack group.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
     */
    public readonly executionRoleName!: pulumi.Output<string>;
    /**
     * The description of the operation.
     */
    public readonly operationDescription!: pulumi.Output<string | undefined>;
    /**
     * The operation settings, in JSON format.
     */
    public readonly operationPreferences!: pulumi.Output<string | undefined>;
    /**
     * The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
     */
    public readonly parameters!: pulumi.Output<outputs.ros.StackGroupParameter[] | undefined>;
    /**
     * The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
     */
    public readonly regionIds!: pulumi.Output<string | undefined>;
    /**
     * The id of Stack Group.
     */
    public /*out*/ readonly stackGroupId!: pulumi.Output<string>;
    /**
     * The name of the stack group. The name must be unique in a region.
     */
    public readonly stackGroupName!: pulumi.Output<string>;
    /**
     * The status of Stack Group.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
     */
    public readonly templateBody!: pulumi.Output<string | undefined>;
    /**
     * The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
     */
    public readonly templateUrl!: pulumi.Output<string | undefined>;
    /**
     * The version of the template.
     */
    public readonly templateVersion!: pulumi.Output<string | undefined>;

    /**
     * Create a StackGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StackGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StackGroupArgs | StackGroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as StackGroupState | undefined;
            inputs["accountIds"] = state ? state.accountIds : undefined;
            inputs["administrationRoleName"] = state ? state.administrationRoleName : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["executionRoleName"] = state ? state.executionRoleName : undefined;
            inputs["operationDescription"] = state ? state.operationDescription : undefined;
            inputs["operationPreferences"] = state ? state.operationPreferences : undefined;
            inputs["parameters"] = state ? state.parameters : undefined;
            inputs["regionIds"] = state ? state.regionIds : undefined;
            inputs["stackGroupId"] = state ? state.stackGroupId : undefined;
            inputs["stackGroupName"] = state ? state.stackGroupName : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["templateBody"] = state ? state.templateBody : undefined;
            inputs["templateUrl"] = state ? state.templateUrl : undefined;
            inputs["templateVersion"] = state ? state.templateVersion : undefined;
        } else {
            const args = argsOrState as StackGroupArgs | undefined;
            if (!args || args.stackGroupName === undefined) {
                throw new Error("Missing required property 'stackGroupName'");
            }
            inputs["accountIds"] = args ? args.accountIds : undefined;
            inputs["administrationRoleName"] = args ? args.administrationRoleName : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["executionRoleName"] = args ? args.executionRoleName : undefined;
            inputs["operationDescription"] = args ? args.operationDescription : undefined;
            inputs["operationPreferences"] = args ? args.operationPreferences : undefined;
            inputs["parameters"] = args ? args.parameters : undefined;
            inputs["regionIds"] = args ? args.regionIds : undefined;
            inputs["stackGroupName"] = args ? args.stackGroupName : undefined;
            inputs["templateBody"] = args ? args.templateBody : undefined;
            inputs["templateUrl"] = args ? args.templateUrl : undefined;
            inputs["templateVersion"] = args ? args.templateVersion : undefined;
            inputs["stackGroupId"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(StackGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StackGroup resources.
 */
export interface StackGroupState {
    /**
     * The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
     */
    readonly accountIds?: pulumi.Input<string>;
    /**
     * The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
     */
    readonly administrationRoleName?: pulumi.Input<string>;
    /**
     * The description of the stack group.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
     */
    readonly executionRoleName?: pulumi.Input<string>;
    /**
     * The description of the operation.
     */
    readonly operationDescription?: pulumi.Input<string>;
    /**
     * The operation settings, in JSON format.
     */
    readonly operationPreferences?: pulumi.Input<string>;
    /**
     * The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
     */
    readonly parameters?: pulumi.Input<pulumi.Input<inputs.ros.StackGroupParameter>[]>;
    /**
     * The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
     */
    readonly regionIds?: pulumi.Input<string>;
    /**
     * The id of Stack Group.
     */
    readonly stackGroupId?: pulumi.Input<string>;
    /**
     * The name of the stack group. The name must be unique in a region.
     */
    readonly stackGroupName?: pulumi.Input<string>;
    /**
     * The status of Stack Group.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
     */
    readonly templateBody?: pulumi.Input<string>;
    /**
     * The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
     */
    readonly templateUrl?: pulumi.Input<string>;
    /**
     * The version of the template.
     */
    readonly templateVersion?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StackGroup resource.
 */
export interface StackGroupArgs {
    /**
     * The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
     */
    readonly accountIds?: pulumi.Input<string>;
    /**
     * The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
     */
    readonly administrationRoleName?: pulumi.Input<string>;
    /**
     * The description of the stack group.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
     */
    readonly executionRoleName?: pulumi.Input<string>;
    /**
     * The description of the operation.
     */
    readonly operationDescription?: pulumi.Input<string>;
    /**
     * The operation settings, in JSON format.
     */
    readonly operationPreferences?: pulumi.Input<string>;
    /**
     * The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
     */
    readonly parameters?: pulumi.Input<pulumi.Input<inputs.ros.StackGroupParameter>[]>;
    /**
     * The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
     */
    readonly regionIds?: pulumi.Input<string>;
    /**
     * The name of the stack group. The name must be unique in a region.
     */
    readonly stackGroupName: pulumi.Input<string>;
    /**
     * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
     */
    readonly templateBody?: pulumi.Input<string>;
    /**
     * The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
     */
    readonly templateUrl?: pulumi.Input<string>;
    /**
     * The version of the template.
     */
    readonly templateVersion?: pulumi.Input<string>;
}