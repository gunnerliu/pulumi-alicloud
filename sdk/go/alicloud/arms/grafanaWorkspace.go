// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package arms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ARMS Grafana Workspace resource.
//
// For information about ARMS Grafana Workspace and how to use it, see [What is Grafana Workspace](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/ListGrafanaWorkspace).
//
// > **NOTE:** Available since v1.215.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/arms"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultResourceGroups, err := resourcemanager.GetResourceGroups(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = arms.NewGrafanaWorkspace(ctx, "defaultGrafanaWorkspace", &arms.GrafanaWorkspaceArgs{
//				GrafanaVersion:          pulumi.String("9.0.x"),
//				Description:             pulumi.String(name),
//				ResourceGroupId:         *pulumi.String(defaultResourceGroups.Ids[0]),
//				GrafanaWorkspaceEdition: pulumi.String("standard"),
//				GrafanaWorkspaceName:    pulumi.String(name),
//				Tags: pulumi.Map{
//					"Created": pulumi.Any("tf"),
//					"For":     pulumi.Any("example"),
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
// ARMS Grafana Workspace can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:arms/grafanaWorkspace:GrafanaWorkspace example <id>
// ```
type GrafanaWorkspace struct {
	pulumi.CustomResourceState

	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The version of the grafana.
	GrafanaVersion pulumi.StringPtrOutput `pulumi:"grafanaVersion"`
	// The edition of the grafana.
	GrafanaWorkspaceEdition pulumi.StringPtrOutput `pulumi:"grafanaWorkspaceEdition"`
	// The name of the resource.
	GrafanaWorkspaceName pulumi.StringPtrOutput `pulumi:"grafanaWorkspaceName"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tag of the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewGrafanaWorkspace registers a new resource with the given unique name, arguments, and options.
func NewGrafanaWorkspace(ctx *pulumi.Context,
	name string, args *GrafanaWorkspaceArgs, opts ...pulumi.ResourceOption) (*GrafanaWorkspace, error) {
	if args == nil {
		args = &GrafanaWorkspaceArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GrafanaWorkspace
	err := ctx.RegisterResource("alicloud:arms/grafanaWorkspace:GrafanaWorkspace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrafanaWorkspace gets an existing GrafanaWorkspace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrafanaWorkspace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrafanaWorkspaceState, opts ...pulumi.ResourceOption) (*GrafanaWorkspace, error) {
	var resource GrafanaWorkspace
	err := ctx.ReadResource("alicloud:arms/grafanaWorkspace:GrafanaWorkspace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GrafanaWorkspace resources.
type grafanaWorkspaceState struct {
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// Description.
	Description *string `pulumi:"description"`
	// The version of the grafana.
	GrafanaVersion *string `pulumi:"grafanaVersion"`
	// The edition of the grafana.
	GrafanaWorkspaceEdition *string `pulumi:"grafanaWorkspaceEdition"`
	// The name of the resource.
	GrafanaWorkspaceName *string `pulumi:"grafanaWorkspaceName"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The tag of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

type GrafanaWorkspaceState struct {
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// Description.
	Description pulumi.StringPtrInput
	// The version of the grafana.
	GrafanaVersion pulumi.StringPtrInput
	// The edition of the grafana.
	GrafanaWorkspaceEdition pulumi.StringPtrInput
	// The name of the resource.
	GrafanaWorkspaceName pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The tag of the resource.
	Tags pulumi.MapInput
}

func (GrafanaWorkspaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*grafanaWorkspaceState)(nil)).Elem()
}

type grafanaWorkspaceArgs struct {
	// Description.
	Description *string `pulumi:"description"`
	// The version of the grafana.
	GrafanaVersion *string `pulumi:"grafanaVersion"`
	// The edition of the grafana.
	GrafanaWorkspaceEdition *string `pulumi:"grafanaWorkspaceEdition"`
	// The name of the resource.
	GrafanaWorkspaceName *string `pulumi:"grafanaWorkspaceName"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The tag of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a GrafanaWorkspace resource.
type GrafanaWorkspaceArgs struct {
	// Description.
	Description pulumi.StringPtrInput
	// The version of the grafana.
	GrafanaVersion pulumi.StringPtrInput
	// The edition of the grafana.
	GrafanaWorkspaceEdition pulumi.StringPtrInput
	// The name of the resource.
	GrafanaWorkspaceName pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The tag of the resource.
	Tags pulumi.MapInput
}

func (GrafanaWorkspaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grafanaWorkspaceArgs)(nil)).Elem()
}

type GrafanaWorkspaceInput interface {
	pulumi.Input

	ToGrafanaWorkspaceOutput() GrafanaWorkspaceOutput
	ToGrafanaWorkspaceOutputWithContext(ctx context.Context) GrafanaWorkspaceOutput
}

func (*GrafanaWorkspace) ElementType() reflect.Type {
	return reflect.TypeOf((**GrafanaWorkspace)(nil)).Elem()
}

func (i *GrafanaWorkspace) ToGrafanaWorkspaceOutput() GrafanaWorkspaceOutput {
	return i.ToGrafanaWorkspaceOutputWithContext(context.Background())
}

func (i *GrafanaWorkspace) ToGrafanaWorkspaceOutputWithContext(ctx context.Context) GrafanaWorkspaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrafanaWorkspaceOutput)
}

// GrafanaWorkspaceArrayInput is an input type that accepts GrafanaWorkspaceArray and GrafanaWorkspaceArrayOutput values.
// You can construct a concrete instance of `GrafanaWorkspaceArrayInput` via:
//
//	GrafanaWorkspaceArray{ GrafanaWorkspaceArgs{...} }
type GrafanaWorkspaceArrayInput interface {
	pulumi.Input

	ToGrafanaWorkspaceArrayOutput() GrafanaWorkspaceArrayOutput
	ToGrafanaWorkspaceArrayOutputWithContext(context.Context) GrafanaWorkspaceArrayOutput
}

type GrafanaWorkspaceArray []GrafanaWorkspaceInput

func (GrafanaWorkspaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrafanaWorkspace)(nil)).Elem()
}

func (i GrafanaWorkspaceArray) ToGrafanaWorkspaceArrayOutput() GrafanaWorkspaceArrayOutput {
	return i.ToGrafanaWorkspaceArrayOutputWithContext(context.Background())
}

func (i GrafanaWorkspaceArray) ToGrafanaWorkspaceArrayOutputWithContext(ctx context.Context) GrafanaWorkspaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrafanaWorkspaceArrayOutput)
}

// GrafanaWorkspaceMapInput is an input type that accepts GrafanaWorkspaceMap and GrafanaWorkspaceMapOutput values.
// You can construct a concrete instance of `GrafanaWorkspaceMapInput` via:
//
//	GrafanaWorkspaceMap{ "key": GrafanaWorkspaceArgs{...} }
type GrafanaWorkspaceMapInput interface {
	pulumi.Input

	ToGrafanaWorkspaceMapOutput() GrafanaWorkspaceMapOutput
	ToGrafanaWorkspaceMapOutputWithContext(context.Context) GrafanaWorkspaceMapOutput
}

type GrafanaWorkspaceMap map[string]GrafanaWorkspaceInput

func (GrafanaWorkspaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrafanaWorkspace)(nil)).Elem()
}

func (i GrafanaWorkspaceMap) ToGrafanaWorkspaceMapOutput() GrafanaWorkspaceMapOutput {
	return i.ToGrafanaWorkspaceMapOutputWithContext(context.Background())
}

func (i GrafanaWorkspaceMap) ToGrafanaWorkspaceMapOutputWithContext(ctx context.Context) GrafanaWorkspaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrafanaWorkspaceMapOutput)
}

type GrafanaWorkspaceOutput struct{ *pulumi.OutputState }

func (GrafanaWorkspaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GrafanaWorkspace)(nil)).Elem()
}

func (o GrafanaWorkspaceOutput) ToGrafanaWorkspaceOutput() GrafanaWorkspaceOutput {
	return o
}

func (o GrafanaWorkspaceOutput) ToGrafanaWorkspaceOutputWithContext(ctx context.Context) GrafanaWorkspaceOutput {
	return o
}

// The creation time of the resource.
func (o GrafanaWorkspaceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *GrafanaWorkspace) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Description.
func (o GrafanaWorkspaceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrafanaWorkspace) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The version of the grafana.
func (o GrafanaWorkspaceOutput) GrafanaVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrafanaWorkspace) pulumi.StringPtrOutput { return v.GrafanaVersion }).(pulumi.StringPtrOutput)
}

// The edition of the grafana.
func (o GrafanaWorkspaceOutput) GrafanaWorkspaceEdition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrafanaWorkspace) pulumi.StringPtrOutput { return v.GrafanaWorkspaceEdition }).(pulumi.StringPtrOutput)
}

// The name of the resource.
func (o GrafanaWorkspaceOutput) GrafanaWorkspaceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrafanaWorkspace) pulumi.StringPtrOutput { return v.GrafanaWorkspaceName }).(pulumi.StringPtrOutput)
}

// The ID of the resource group.
func (o GrafanaWorkspaceOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *GrafanaWorkspace) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The status of the resource.
func (o GrafanaWorkspaceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *GrafanaWorkspace) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tag of the resource.
func (o GrafanaWorkspaceOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *GrafanaWorkspace) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

type GrafanaWorkspaceArrayOutput struct{ *pulumi.OutputState }

func (GrafanaWorkspaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrafanaWorkspace)(nil)).Elem()
}

func (o GrafanaWorkspaceArrayOutput) ToGrafanaWorkspaceArrayOutput() GrafanaWorkspaceArrayOutput {
	return o
}

func (o GrafanaWorkspaceArrayOutput) ToGrafanaWorkspaceArrayOutputWithContext(ctx context.Context) GrafanaWorkspaceArrayOutput {
	return o
}

func (o GrafanaWorkspaceArrayOutput) Index(i pulumi.IntInput) GrafanaWorkspaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GrafanaWorkspace {
		return vs[0].([]*GrafanaWorkspace)[vs[1].(int)]
	}).(GrafanaWorkspaceOutput)
}

type GrafanaWorkspaceMapOutput struct{ *pulumi.OutputState }

func (GrafanaWorkspaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrafanaWorkspace)(nil)).Elem()
}

func (o GrafanaWorkspaceMapOutput) ToGrafanaWorkspaceMapOutput() GrafanaWorkspaceMapOutput {
	return o
}

func (o GrafanaWorkspaceMapOutput) ToGrafanaWorkspaceMapOutputWithContext(ctx context.Context) GrafanaWorkspaceMapOutput {
	return o
}

func (o GrafanaWorkspaceMapOutput) MapIndex(k pulumi.StringInput) GrafanaWorkspaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GrafanaWorkspace {
		return vs[0].(map[string]*GrafanaWorkspace)[vs[1].(string)]
	}).(GrafanaWorkspaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrafanaWorkspaceInput)(nil)).Elem(), &GrafanaWorkspace{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrafanaWorkspaceArrayInput)(nil)).Elem(), GrafanaWorkspaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrafanaWorkspaceMapInput)(nil)).Elem(), GrafanaWorkspaceMap{})
	pulumi.RegisterOutputType(GrafanaWorkspaceOutput{})
	pulumi.RegisterOutputType(GrafanaWorkspaceArrayOutput{})
	pulumi.RegisterOutputType(GrafanaWorkspaceMapOutput{})
}
