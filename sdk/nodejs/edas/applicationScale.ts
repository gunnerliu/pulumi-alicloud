// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EDAS application scale resource.
 * 
 * > **NOTE:** Available in 1.82.0+
 * 
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/edas_application_scale.html.markdown.
 */
export class ApplicationScale extends pulumi.CustomResource {
    /**
     * Get an existing ApplicationScale resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationScaleState, opts?: pulumi.CustomResourceOptions): ApplicationScale {
        return new ApplicationScale(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:edas/applicationScale:ApplicationScale';

    /**
     * Returns true if the given object is an instance of ApplicationScale.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplicationScale {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplicationScale.__pulumiType;
    }

    /**
     * The ID of the application that you want to deploy.
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * The ID of the instance group to which you want to add ECS instances to scale out the application.
     */
    public readonly deployGroup!: pulumi.Output<string>;
    /**
     * The ecc information of the resource supplied above. The value is formulated as `<ecc1,ecc2>`.
     */
    public /*out*/ readonly eccInfo!: pulumi.Output<string>;
    /**
     * The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
     */
    public readonly ecuInfos!: pulumi.Output<string[]>;
    /**
     * This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
     */
    public readonly forceStatus!: pulumi.Output<boolean | undefined>;

    /**
     * Create a ApplicationScale resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationScaleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationScaleArgs | ApplicationScaleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ApplicationScaleState | undefined;
            inputs["appId"] = state ? state.appId : undefined;
            inputs["deployGroup"] = state ? state.deployGroup : undefined;
            inputs["eccInfo"] = state ? state.eccInfo : undefined;
            inputs["ecuInfos"] = state ? state.ecuInfos : undefined;
            inputs["forceStatus"] = state ? state.forceStatus : undefined;
        } else {
            const args = argsOrState as ApplicationScaleArgs | undefined;
            if (!args || args.appId === undefined) {
                throw new Error("Missing required property 'appId'");
            }
            if (!args || args.deployGroup === undefined) {
                throw new Error("Missing required property 'deployGroup'");
            }
            if (!args || args.ecuInfos === undefined) {
                throw new Error("Missing required property 'ecuInfos'");
            }
            inputs["appId"] = args ? args.appId : undefined;
            inputs["deployGroup"] = args ? args.deployGroup : undefined;
            inputs["ecuInfos"] = args ? args.ecuInfos : undefined;
            inputs["forceStatus"] = args ? args.forceStatus : undefined;
            inputs["eccInfo"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ApplicationScale.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplicationScale resources.
 */
export interface ApplicationScaleState {
    /**
     * The ID of the application that you want to deploy.
     */
    readonly appId?: pulumi.Input<string>;
    /**
     * The ID of the instance group to which you want to add ECS instances to scale out the application.
     */
    readonly deployGroup?: pulumi.Input<string>;
    /**
     * The ecc information of the resource supplied above. The value is formulated as `<ecc1,ecc2>`.
     */
    readonly eccInfo?: pulumi.Input<string>;
    /**
     * The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
     */
    readonly ecuInfos?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
     */
    readonly forceStatus?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ApplicationScale resource.
 */
export interface ApplicationScaleArgs {
    /**
     * The ID of the application that you want to deploy.
     */
    readonly appId: pulumi.Input<string>;
    /**
     * The ID of the instance group to which you want to add ECS instances to scale out the application.
     */
    readonly deployGroup: pulumi.Input<string>;
    /**
     * The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
     */
    readonly ecuInfos: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
     */
    readonly forceStatus?: pulumi.Input<boolean>;
}