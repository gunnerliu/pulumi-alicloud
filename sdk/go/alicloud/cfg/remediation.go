// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cfg

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Config Remediation resource.
//
// For information about Config Remediation and how to use it, see [What is Remediation](https://www.alibabacloud.com/help/en/cloud-config/latest/api-config-2020-09-07-createremediation).
//
// > **NOTE:** Available since v1.204.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cfg"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/oss"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-example-oss"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultRegions, err := alicloud.GetRegions(ctx, &alicloud.GetRegionsArgs{
//				Current: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultBucket, err := oss.NewBucket(ctx, "defaultBucket", &oss.BucketArgs{
//				Bucket: pulumi.String(name),
//				Acl:    pulumi.String("public-read"),
//				Tags: pulumi.AnyMap{
//					"For": pulumi.Any("example"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			defaultRule, err := cfg.NewRule(ctx, "defaultRule", &cfg.RuleArgs{
//				Description:            pulumi.String("If the ACL policy of the OSS bucket denies read access from the Internet, the configuration is considered compliant."),
//				SourceOwner:            pulumi.String("ALIYUN"),
//				SourceIdentifier:       pulumi.String("oss-bucket-public-read-prohibited"),
//				RiskLevel:              pulumi.Int(1),
//				TagKeyScope:            pulumi.String("For"),
//				TagValueScope:          pulumi.String("example"),
//				RegionIdsScope:         *pulumi.String(defaultRegions.Regions[0].Id),
//				ConfigRuleTriggerTypes: pulumi.String("ConfigurationItemChangeNotification"),
//				ResourceTypesScopes: pulumi.StringArray{
//					pulumi.String("ACS::OSS::Bucket"),
//				},
//				RuleName: pulumi.String("oss-bucket-public-read-prohibited"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cfg.NewRemediation(ctx, "defaultRemediation", &cfg.RemediationArgs{
//				ConfigRuleId:          defaultRule.ConfigRuleId,
//				RemediationTemplateId: pulumi.String("ACS-OSS-PutBucketAcl"),
//				RemediationSourceType: pulumi.String("ALIYUN"),
//				InvokeType:            pulumi.String("MANUAL_EXECUTION"),
//				Params: defaultBucket.Bucket.ApplyT(func(bucket *string) (string, error) {
//					return fmt.Sprintf("{\"bucketName\": \"%v\", \"regionId\": \"%v\", \"permissionName\": \"private\"}", bucket, defaultRegions.Regions[0].Id), nil
//				}).(pulumi.StringOutput),
//				RemediationType: pulumi.String("OOS"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Config Remediation can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cfg/remediation:Remediation example <id>
//
// ```
type Remediation struct {
	pulumi.CustomResourceState

	// Rule ID.
	ConfigRuleId pulumi.StringOutput `pulumi:"configRuleId"`
	// Execution type, valid values: `Manual`, `Automatic`.
	InvokeType pulumi.StringOutput `pulumi:"invokeType"`
	// Remediation parameter.
	Params pulumi.StringOutput `pulumi:"params"`
	// Remediation ID.
	RemediationId pulumi.StringOutput `pulumi:"remediationId"`
	// Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
	RemediationSourceType pulumi.StringOutput `pulumi:"remediationSourceType"`
	// Remediation template ID.
	RemediationTemplateId pulumi.StringOutput `pulumi:"remediationTemplateId"`
	// Remediation type, valid values: `OOS`, `FC`.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	RemediationType pulumi.StringOutput `pulumi:"remediationType"`
}

// NewRemediation registers a new resource with the given unique name, arguments, and options.
func NewRemediation(ctx *pulumi.Context,
	name string, args *RemediationArgs, opts ...pulumi.ResourceOption) (*Remediation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigRuleId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigRuleId'")
	}
	if args.InvokeType == nil {
		return nil, errors.New("invalid value for required argument 'InvokeType'")
	}
	if args.Params == nil {
		return nil, errors.New("invalid value for required argument 'Params'")
	}
	if args.RemediationTemplateId == nil {
		return nil, errors.New("invalid value for required argument 'RemediationTemplateId'")
	}
	if args.RemediationType == nil {
		return nil, errors.New("invalid value for required argument 'RemediationType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Remediation
	err := ctx.RegisterResource("alicloud:cfg/remediation:Remediation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRemediation gets an existing Remediation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRemediation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RemediationState, opts ...pulumi.ResourceOption) (*Remediation, error) {
	var resource Remediation
	err := ctx.ReadResource("alicloud:cfg/remediation:Remediation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Remediation resources.
type remediationState struct {
	// Rule ID.
	ConfigRuleId *string `pulumi:"configRuleId"`
	// Execution type, valid values: `Manual`, `Automatic`.
	InvokeType *string `pulumi:"invokeType"`
	// Remediation parameter.
	Params *string `pulumi:"params"`
	// Remediation ID.
	RemediationId *string `pulumi:"remediationId"`
	// Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
	RemediationSourceType *string `pulumi:"remediationSourceType"`
	// Remediation template ID.
	RemediationTemplateId *string `pulumi:"remediationTemplateId"`
	// Remediation type, valid values: `OOS`, `FC`.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	RemediationType *string `pulumi:"remediationType"`
}

type RemediationState struct {
	// Rule ID.
	ConfigRuleId pulumi.StringPtrInput
	// Execution type, valid values: `Manual`, `Automatic`.
	InvokeType pulumi.StringPtrInput
	// Remediation parameter.
	Params pulumi.StringPtrInput
	// Remediation ID.
	RemediationId pulumi.StringPtrInput
	// Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
	RemediationSourceType pulumi.StringPtrInput
	// Remediation template ID.
	RemediationTemplateId pulumi.StringPtrInput
	// Remediation type, valid values: `OOS`, `FC`.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	RemediationType pulumi.StringPtrInput
}

func (RemediationState) ElementType() reflect.Type {
	return reflect.TypeOf((*remediationState)(nil)).Elem()
}

type remediationArgs struct {
	// Rule ID.
	ConfigRuleId string `pulumi:"configRuleId"`
	// Execution type, valid values: `Manual`, `Automatic`.
	InvokeType string `pulumi:"invokeType"`
	// Remediation parameter.
	Params string `pulumi:"params"`
	// Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
	RemediationSourceType *string `pulumi:"remediationSourceType"`
	// Remediation template ID.
	RemediationTemplateId string `pulumi:"remediationTemplateId"`
	// Remediation type, valid values: `OOS`, `FC`.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	RemediationType string `pulumi:"remediationType"`
}

// The set of arguments for constructing a Remediation resource.
type RemediationArgs struct {
	// Rule ID.
	ConfigRuleId pulumi.StringInput
	// Execution type, valid values: `Manual`, `Automatic`.
	InvokeType pulumi.StringInput
	// Remediation parameter.
	Params pulumi.StringInput
	// Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
	RemediationSourceType pulumi.StringPtrInput
	// Remediation template ID.
	RemediationTemplateId pulumi.StringInput
	// Remediation type, valid values: `OOS`, `FC`.
	//
	// The following arguments will be discarded. Please use new fields as soon as possible:
	RemediationType pulumi.StringInput
}

func (RemediationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*remediationArgs)(nil)).Elem()
}

type RemediationInput interface {
	pulumi.Input

	ToRemediationOutput() RemediationOutput
	ToRemediationOutputWithContext(ctx context.Context) RemediationOutput
}

func (*Remediation) ElementType() reflect.Type {
	return reflect.TypeOf((**Remediation)(nil)).Elem()
}

func (i *Remediation) ToRemediationOutput() RemediationOutput {
	return i.ToRemediationOutputWithContext(context.Background())
}

func (i *Remediation) ToRemediationOutputWithContext(ctx context.Context) RemediationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RemediationOutput)
}

func (i *Remediation) ToOutput(ctx context.Context) pulumix.Output[*Remediation] {
	return pulumix.Output[*Remediation]{
		OutputState: i.ToRemediationOutputWithContext(ctx).OutputState,
	}
}

// RemediationArrayInput is an input type that accepts RemediationArray and RemediationArrayOutput values.
// You can construct a concrete instance of `RemediationArrayInput` via:
//
//	RemediationArray{ RemediationArgs{...} }
type RemediationArrayInput interface {
	pulumi.Input

	ToRemediationArrayOutput() RemediationArrayOutput
	ToRemediationArrayOutputWithContext(context.Context) RemediationArrayOutput
}

type RemediationArray []RemediationInput

func (RemediationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Remediation)(nil)).Elem()
}

func (i RemediationArray) ToRemediationArrayOutput() RemediationArrayOutput {
	return i.ToRemediationArrayOutputWithContext(context.Background())
}

func (i RemediationArray) ToRemediationArrayOutputWithContext(ctx context.Context) RemediationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RemediationArrayOutput)
}

func (i RemediationArray) ToOutput(ctx context.Context) pulumix.Output[[]*Remediation] {
	return pulumix.Output[[]*Remediation]{
		OutputState: i.ToRemediationArrayOutputWithContext(ctx).OutputState,
	}
}

// RemediationMapInput is an input type that accepts RemediationMap and RemediationMapOutput values.
// You can construct a concrete instance of `RemediationMapInput` via:
//
//	RemediationMap{ "key": RemediationArgs{...} }
type RemediationMapInput interface {
	pulumi.Input

	ToRemediationMapOutput() RemediationMapOutput
	ToRemediationMapOutputWithContext(context.Context) RemediationMapOutput
}

type RemediationMap map[string]RemediationInput

func (RemediationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Remediation)(nil)).Elem()
}

func (i RemediationMap) ToRemediationMapOutput() RemediationMapOutput {
	return i.ToRemediationMapOutputWithContext(context.Background())
}

func (i RemediationMap) ToRemediationMapOutputWithContext(ctx context.Context) RemediationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RemediationMapOutput)
}

func (i RemediationMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Remediation] {
	return pulumix.Output[map[string]*Remediation]{
		OutputState: i.ToRemediationMapOutputWithContext(ctx).OutputState,
	}
}

type RemediationOutput struct{ *pulumi.OutputState }

func (RemediationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Remediation)(nil)).Elem()
}

func (o RemediationOutput) ToRemediationOutput() RemediationOutput {
	return o
}

func (o RemediationOutput) ToRemediationOutputWithContext(ctx context.Context) RemediationOutput {
	return o
}

func (o RemediationOutput) ToOutput(ctx context.Context) pulumix.Output[*Remediation] {
	return pulumix.Output[*Remediation]{
		OutputState: o.OutputState,
	}
}

// Rule ID.
func (o RemediationOutput) ConfigRuleId() pulumi.StringOutput {
	return o.ApplyT(func(v *Remediation) pulumi.StringOutput { return v.ConfigRuleId }).(pulumi.StringOutput)
}

// Execution type, valid values: `Manual`, `Automatic`.
func (o RemediationOutput) InvokeType() pulumi.StringOutput {
	return o.ApplyT(func(v *Remediation) pulumi.StringOutput { return v.InvokeType }).(pulumi.StringOutput)
}

// Remediation parameter.
func (o RemediationOutput) Params() pulumi.StringOutput {
	return o.ApplyT(func(v *Remediation) pulumi.StringOutput { return v.Params }).(pulumi.StringOutput)
}

// Remediation ID.
func (o RemediationOutput) RemediationId() pulumi.StringOutput {
	return o.ApplyT(func(v *Remediation) pulumi.StringOutput { return v.RemediationId }).(pulumi.StringOutput)
}

// Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
func (o RemediationOutput) RemediationSourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Remediation) pulumi.StringOutput { return v.RemediationSourceType }).(pulumi.StringOutput)
}

// Remediation template ID.
func (o RemediationOutput) RemediationTemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v *Remediation) pulumi.StringOutput { return v.RemediationTemplateId }).(pulumi.StringOutput)
}

// Remediation type, valid values: `OOS`, `FC`.
//
// The following arguments will be discarded. Please use new fields as soon as possible:
func (o RemediationOutput) RemediationType() pulumi.StringOutput {
	return o.ApplyT(func(v *Remediation) pulumi.StringOutput { return v.RemediationType }).(pulumi.StringOutput)
}

type RemediationArrayOutput struct{ *pulumi.OutputState }

func (RemediationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Remediation)(nil)).Elem()
}

func (o RemediationArrayOutput) ToRemediationArrayOutput() RemediationArrayOutput {
	return o
}

func (o RemediationArrayOutput) ToRemediationArrayOutputWithContext(ctx context.Context) RemediationArrayOutput {
	return o
}

func (o RemediationArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Remediation] {
	return pulumix.Output[[]*Remediation]{
		OutputState: o.OutputState,
	}
}

func (o RemediationArrayOutput) Index(i pulumi.IntInput) RemediationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Remediation {
		return vs[0].([]*Remediation)[vs[1].(int)]
	}).(RemediationOutput)
}

type RemediationMapOutput struct{ *pulumi.OutputState }

func (RemediationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Remediation)(nil)).Elem()
}

func (o RemediationMapOutput) ToRemediationMapOutput() RemediationMapOutput {
	return o
}

func (o RemediationMapOutput) ToRemediationMapOutputWithContext(ctx context.Context) RemediationMapOutput {
	return o
}

func (o RemediationMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Remediation] {
	return pulumix.Output[map[string]*Remediation]{
		OutputState: o.OutputState,
	}
}

func (o RemediationMapOutput) MapIndex(k pulumi.StringInput) RemediationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Remediation {
		return vs[0].(map[string]*Remediation)[vs[1].(string)]
	}).(RemediationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RemediationInput)(nil)).Elem(), &Remediation{})
	pulumi.RegisterInputType(reflect.TypeOf((*RemediationArrayInput)(nil)).Elem(), RemediationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RemediationMapInput)(nil)).Elem(), RemediationMap{})
	pulumi.RegisterOutputType(RemediationOutput{})
	pulumi.RegisterOutputType(RemediationArrayOutput{})
	pulumi.RegisterOutputType(RemediationMapOutput{})
}
