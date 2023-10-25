// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Apsara Agile Live (IMP) App Template resource.
 *
 * For information about Apsara Agile Live (IMP) App Template and how to use it, see [What is App Template](https://help.aliyun.com/document_detail/270121.html).
 *
 * > **NOTE:** Available in v1.137.0+.
 *
 * ## Import
 *
 * Apsara Agile Live (IMP) App Template can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:imp/appTemplate:AppTemplate example <id>
 * ```
 */
export class AppTemplate extends pulumi.CustomResource {
    /**
     * Get an existing AppTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppTemplateState, opts?: pulumi.CustomResourceOptions): AppTemplate {
        return new AppTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:imp/appTemplate:AppTemplate';

    /**
     * Returns true if the given object is an instance of AppTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppTemplate.__pulumiType;
    }

    /**
     * The name of the resource.
     */
    public readonly appTemplateName!: pulumi.Output<string>;
    /**
     * List of components. Its element valid values: ["component.live","component.liveRecord","component.liveBeauty","component.rtc","component.rtcRecord","component.im","component.whiteboard","component.liveSecurity","component.chatSecurity"].
     */
    public readonly componentLists!: pulumi.Output<string[]>;
    /**
     * Configuration list. It have several default configs after the resource is created. See the following `Block configList`.
     */
    public readonly configLists!: pulumi.Output<outputs.imp.AppTemplateConfigList[]>;
    /**
     * Integration mode. Valid values:
     * * paasSDK: Integrated SDK.
     * * standardRoom: Model Room.
     */
    public readonly integrationMode!: pulumi.Output<string | undefined>;
    /**
     * Application Template scenario. Valid values: ["business", "classroom"].
     */
    public readonly scene!: pulumi.Output<string | undefined>;
    /**
     * Application template usage status.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a AppTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppTemplateArgs | AppTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppTemplateState | undefined;
            resourceInputs["appTemplateName"] = state ? state.appTemplateName : undefined;
            resourceInputs["componentLists"] = state ? state.componentLists : undefined;
            resourceInputs["configLists"] = state ? state.configLists : undefined;
            resourceInputs["integrationMode"] = state ? state.integrationMode : undefined;
            resourceInputs["scene"] = state ? state.scene : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as AppTemplateArgs | undefined;
            if ((!args || args.appTemplateName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appTemplateName'");
            }
            if ((!args || args.componentLists === undefined) && !opts.urn) {
                throw new Error("Missing required property 'componentLists'");
            }
            resourceInputs["appTemplateName"] = args ? args.appTemplateName : undefined;
            resourceInputs["componentLists"] = args ? args.componentLists : undefined;
            resourceInputs["configLists"] = args ? args.configLists : undefined;
            resourceInputs["integrationMode"] = args ? args.integrationMode : undefined;
            resourceInputs["scene"] = args ? args.scene : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppTemplate resources.
 */
export interface AppTemplateState {
    /**
     * The name of the resource.
     */
    appTemplateName?: pulumi.Input<string>;
    /**
     * List of components. Its element valid values: ["component.live","component.liveRecord","component.liveBeauty","component.rtc","component.rtcRecord","component.im","component.whiteboard","component.liveSecurity","component.chatSecurity"].
     */
    componentLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration list. It have several default configs after the resource is created. See the following `Block configList`.
     */
    configLists?: pulumi.Input<pulumi.Input<inputs.imp.AppTemplateConfigList>[]>;
    /**
     * Integration mode. Valid values:
     * * paasSDK: Integrated SDK.
     * * standardRoom: Model Room.
     */
    integrationMode?: pulumi.Input<string>;
    /**
     * Application Template scenario. Valid values: ["business", "classroom"].
     */
    scene?: pulumi.Input<string>;
    /**
     * Application template usage status.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppTemplate resource.
 */
export interface AppTemplateArgs {
    /**
     * The name of the resource.
     */
    appTemplateName: pulumi.Input<string>;
    /**
     * List of components. Its element valid values: ["component.live","component.liveRecord","component.liveBeauty","component.rtc","component.rtcRecord","component.im","component.whiteboard","component.liveSecurity","component.chatSecurity"].
     */
    componentLists: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration list. It have several default configs after the resource is created. See the following `Block configList`.
     */
    configLists?: pulumi.Input<pulumi.Input<inputs.imp.AppTemplateConfigList>[]>;
    /**
     * Integration mode. Valid values:
     * * paasSDK: Integrated SDK.
     * * standardRoom: Model Room.
     */
    integrationMode?: pulumi.Input<string>;
    /**
     * Application Template scenario. Valid values: ["business", "classroom"].
     */
    scene?: pulumi.Input<string>;
}
