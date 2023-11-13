// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud Monitor Service Monitor Group resource.
//
// For information about Cloud Monitor Service Monitor Group and how to use it, see [What is Monitor Group](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createmonitorgroup).
//
// > **NOTE:** Available since v1.113.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cms.NewMonitorGroup(ctx, "example", &cms.MonitorGroupArgs{
//				MonitorGroupName: pulumi.String("tf-example-accmonitorgroup"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cms.NewMonitorGroup(ctx, "default2", &cms.MonitorGroupArgs{
//				ContactGroups: pulumi.StringArray{
//					pulumi.String("your_contact_groups"),
//				},
//				ResourceGroupId:   pulumi.String("your_resource_group_id"),
//				ResourceGroupName: pulumi.String("resource_group_name"),
//				Tags: pulumi.Map{
//					"Created": pulumi.Any("TF"),
//					"For":     pulumi.Any("Acceptance-example"),
//				},
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
// Cloud Monitor Service Monitor Group can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cms/monitorGroup:MonitorGroup example <id>
//
// ```
type MonitorGroup struct {
	pulumi.CustomResourceState

	// The alert group to which alert notifications will be sent.
	ContactGroups pulumi.StringArrayOutput `pulumi:"contactGroups"`
	// The name of the application group.
	MonitorGroupName pulumi.StringOutput `pulumi:"monitorGroupName"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// The name of the resource group.
	ResourceGroupName pulumi.StringPtrOutput `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewMonitorGroup registers a new resource with the given unique name, arguments, and options.
func NewMonitorGroup(ctx *pulumi.Context,
	name string, args *MonitorGroupArgs, opts ...pulumi.ResourceOption) (*MonitorGroup, error) {
	if args == nil {
		args = &MonitorGroupArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MonitorGroup
	err := ctx.RegisterResource("alicloud:cms/monitorGroup:MonitorGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitorGroup gets an existing MonitorGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitorGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitorGroupState, opts ...pulumi.ResourceOption) (*MonitorGroup, error) {
	var resource MonitorGroup
	err := ctx.ReadResource("alicloud:cms/monitorGroup:MonitorGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitorGroup resources.
type monitorGroupState struct {
	// The alert group to which alert notifications will be sent.
	ContactGroups []string `pulumi:"contactGroups"`
	// The name of the application group.
	MonitorGroupName *string `pulumi:"monitorGroupName"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of the resource group.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

type MonitorGroupState struct {
	// The alert group to which alert notifications will be sent.
	ContactGroups pulumi.StringArrayInput
	// The name of the application group.
	MonitorGroupName pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The name of the resource group.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
}

func (MonitorGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorGroupState)(nil)).Elem()
}

type monitorGroupArgs struct {
	// The alert group to which alert notifications will be sent.
	ContactGroups []string `pulumi:"contactGroups"`
	// The name of the application group.
	MonitorGroupName *string `pulumi:"monitorGroupName"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of the resource group.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a MonitorGroup resource.
type MonitorGroupArgs struct {
	// The alert group to which alert notifications will be sent.
	ContactGroups pulumi.StringArrayInput
	// The name of the application group.
	MonitorGroupName pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The name of the resource group.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
}

func (MonitorGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorGroupArgs)(nil)).Elem()
}

type MonitorGroupInput interface {
	pulumi.Input

	ToMonitorGroupOutput() MonitorGroupOutput
	ToMonitorGroupOutputWithContext(ctx context.Context) MonitorGroupOutput
}

func (*MonitorGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorGroup)(nil)).Elem()
}

func (i *MonitorGroup) ToMonitorGroupOutput() MonitorGroupOutput {
	return i.ToMonitorGroupOutputWithContext(context.Background())
}

func (i *MonitorGroup) ToMonitorGroupOutputWithContext(ctx context.Context) MonitorGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupOutput)
}

// MonitorGroupArrayInput is an input type that accepts MonitorGroupArray and MonitorGroupArrayOutput values.
// You can construct a concrete instance of `MonitorGroupArrayInput` via:
//
//	MonitorGroupArray{ MonitorGroupArgs{...} }
type MonitorGroupArrayInput interface {
	pulumi.Input

	ToMonitorGroupArrayOutput() MonitorGroupArrayOutput
	ToMonitorGroupArrayOutputWithContext(context.Context) MonitorGroupArrayOutput
}

type MonitorGroupArray []MonitorGroupInput

func (MonitorGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorGroup)(nil)).Elem()
}

func (i MonitorGroupArray) ToMonitorGroupArrayOutput() MonitorGroupArrayOutput {
	return i.ToMonitorGroupArrayOutputWithContext(context.Background())
}

func (i MonitorGroupArray) ToMonitorGroupArrayOutputWithContext(ctx context.Context) MonitorGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupArrayOutput)
}

// MonitorGroupMapInput is an input type that accepts MonitorGroupMap and MonitorGroupMapOutput values.
// You can construct a concrete instance of `MonitorGroupMapInput` via:
//
//	MonitorGroupMap{ "key": MonitorGroupArgs{...} }
type MonitorGroupMapInput interface {
	pulumi.Input

	ToMonitorGroupMapOutput() MonitorGroupMapOutput
	ToMonitorGroupMapOutputWithContext(context.Context) MonitorGroupMapOutput
}

type MonitorGroupMap map[string]MonitorGroupInput

func (MonitorGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorGroup)(nil)).Elem()
}

func (i MonitorGroupMap) ToMonitorGroupMapOutput() MonitorGroupMapOutput {
	return i.ToMonitorGroupMapOutputWithContext(context.Background())
}

func (i MonitorGroupMap) ToMonitorGroupMapOutputWithContext(ctx context.Context) MonitorGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupMapOutput)
}

type MonitorGroupOutput struct{ *pulumi.OutputState }

func (MonitorGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorGroup)(nil)).Elem()
}

func (o MonitorGroupOutput) ToMonitorGroupOutput() MonitorGroupOutput {
	return o
}

func (o MonitorGroupOutput) ToMonitorGroupOutputWithContext(ctx context.Context) MonitorGroupOutput {
	return o
}

// The alert group to which alert notifications will be sent.
func (o MonitorGroupOutput) ContactGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MonitorGroup) pulumi.StringArrayOutput { return v.ContactGroups }).(pulumi.StringArrayOutput)
}

// The name of the application group.
func (o MonitorGroupOutput) MonitorGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorGroup) pulumi.StringOutput { return v.MonitorGroupName }).(pulumi.StringOutput)
}

// The ID of the resource group.
func (o MonitorGroupOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MonitorGroup) pulumi.StringPtrOutput { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The name of the resource group.
func (o MonitorGroupOutput) ResourceGroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MonitorGroup) pulumi.StringPtrOutput { return v.ResourceGroupName }).(pulumi.StringPtrOutput)
}

// A mapping of tags to assign to the resource.
func (o MonitorGroupOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *MonitorGroup) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

type MonitorGroupArrayOutput struct{ *pulumi.OutputState }

func (MonitorGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorGroup)(nil)).Elem()
}

func (o MonitorGroupArrayOutput) ToMonitorGroupArrayOutput() MonitorGroupArrayOutput {
	return o
}

func (o MonitorGroupArrayOutput) ToMonitorGroupArrayOutputWithContext(ctx context.Context) MonitorGroupArrayOutput {
	return o
}

func (o MonitorGroupArrayOutput) Index(i pulumi.IntInput) MonitorGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MonitorGroup {
		return vs[0].([]*MonitorGroup)[vs[1].(int)]
	}).(MonitorGroupOutput)
}

type MonitorGroupMapOutput struct{ *pulumi.OutputState }

func (MonitorGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorGroup)(nil)).Elem()
}

func (o MonitorGroupMapOutput) ToMonitorGroupMapOutput() MonitorGroupMapOutput {
	return o
}

func (o MonitorGroupMapOutput) ToMonitorGroupMapOutputWithContext(ctx context.Context) MonitorGroupMapOutput {
	return o
}

func (o MonitorGroupMapOutput) MapIndex(k pulumi.StringInput) MonitorGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MonitorGroup {
		return vs[0].(map[string]*MonitorGroup)[vs[1].(string)]
	}).(MonitorGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorGroupInput)(nil)).Elem(), &MonitorGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorGroupArrayInput)(nil)).Elem(), MonitorGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorGroupMapInput)(nil)).Elem(), MonitorGroupMap{})
	pulumi.RegisterOutputType(MonitorGroupOutput{})
	pulumi.RegisterOutputType(MonitorGroupArrayOutput{})
	pulumi.RegisterOutputType(MonitorGroupMapOutput{})
}
